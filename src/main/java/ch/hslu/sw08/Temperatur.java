package ch.hslu.sw08;

import java.util.Objects;

/**
 * Temperaturklassse
 *
 * @author Robin Geissmann
 */
public final class Temperatur implements Comparable<Temperatur> {
    // Privates Feld, welches den aktuellen Wert des Temperatur-Objekts
    // speichert
    private float tempCels;
    private static final float KELVIN_OFFSET = 273.15f;

    /**
     * Konstruktor, welcher die initiale Temperatur aut. auf 20 Grad setzt
     */
    public Temperatur() {
        tempCels = 20.0f;
    }

    /**
     * Konstruktor, bei welchem die initiale Temperatur gewählt werden kann
     */
    Temperatur(float defaultTemp) {
        if (defaultTemp < Float.MIN_VALUE || defaultTemp > Float.MAX_VALUE) {
            tempCels = 20.0f;
        } else {
            tempCels = defaultTemp;
        }
    }

    /**
     * Getter-Methode für die Temperatur in Grad
     */
    public double getCelsius() {
        return tempCels;
    }

    /**
     * Setter-Methode für die Temperatur in Grad
     */
    public void setCelsius(float celsius) {
        tempCels = celsius;
    }

    /**
     * Umrechnung von Grad zu Kelvin
     */
    public float getKelvin() {
        return convertCelsiusToKelvin(tempCels);
    }

    /**
     * Setzten der Temperatur mittels Kelvin Wert
     * */
    public void setKelvin(final float kelvin){
        this.tempCels = convertKelvinToCelsius(kelvin);
    }


    /**
     * Umrechnung von Grd zu Fahrenheit
     */
    public static float convertCelsiusToFarenheit(final float celsius) {
       return celsius * 1.8f + 32f;
    }

    public static float convertKelvinToCelsius(final float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(final float celsius){
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Veränderung der Temperatur um einen relativen Kelvin-Wert, welcher dann in
     * Grad zurückgerechnet wird
     */
    public void changeKelv(float relativevalue) {
        setCelsius((getKelvin() + relativevalue - 273.15f));
    }

    /**
     * Veränderung der Temperatur um einen relativen Grad-Wert
     */
    public void changeCelsius(double relativevalue) {
        tempCels += relativevalue;
    }

    /**
     * Zwei Temperatur-Objekte sind gleich, falls sie die gleiche Identität haben.
     */
    @Override
    public final boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(!(o instanceof Temperatur)){
            return false;
        }
        final Temperatur testTemperatur = (Temperatur) o;
        return (Double.compare(testTemperatur.tempCels, this.tempCels) == 0);
    }

    /**
     * Da zwei Objekte gleich sind, wenn sie die gleiche Identität haben, muss an
     * der hash-Implementation nichts geändert werden
     */
    @Override
    public final int hashCode() {
        return Objects.hash(tempCels);
    }

    @Override
    public final String toString() {
        return "Aktuelle Temperatur in Celsius: " + this.getCelsius();
    }

    /**
     * Zwei Temperatur-Objekte werden aufgrund ihrer Temperatur verglichen
     */
    @Override
    public int compareTo(Temperatur o) {
        return Double.compare(this.getCelsius(), o.getCelsius());
    }

}
