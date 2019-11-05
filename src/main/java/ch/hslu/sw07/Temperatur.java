package ch.hslu.sw07;

import java.util.Objects;

/**
 * Temperaturklassse
 *
 * @author Robin Geissmann
 */
public class Temperatur implements Comparable<Temperatur> {
    // Privates Feld, welches den aktuellen Wert des Temperatur-Objekts
    // speichert
    private double tempCels;

    /**
     * Konstruktor, welcher die initiale Temperatur aut. auf 20 Grad setzt
     */
    public Temperatur() {
        tempCels = 20.0;
    }

    /**
     * Konstruktor, bei welchem die initiale Temperatur gewählt werden kann
     */
    public Temperatur(double defaultTemp) {
        if (defaultTemp < Double.MIN_VALUE || defaultTemp > Double.MAX_VALUE) {
            tempCels = 20.0;
        } else {
            tempCels = defaultTemp;
        }
    }

    /**
     * Getter-Methode für die Temperatur in Grad
     */
    public double getTempCels() {
        return tempCels;
    }

    /**
     * Setter-Methode für die Temperatur in Grad
     */
    public void setTempCels(double input) {
        tempCels = input;
    }

    /**
     * Umrechnung von Grad zu Kelvin
     */
    public double convertCelsToCelvin() {
        double tempKelv = tempCels + 273.15;
        return tempKelv;
    }

    /**
     * Umrechnung von Grd zu Fahrenheit
     */
    public double convertCelsToFar() {
        double tempFar = (tempCels * 1.8) + 32;
        return tempFar;
    }

    /**
     * Veränderung der Temperatur um einen relativen Kelvin-Wert, welcher dann in
     * Grad zurückgerechnet wird
     */
    public void changeKelv(double relativevalue) {
        double tempKelv = convertCelsToCelvin();
        tempKelv += relativevalue;
        setTempCels((tempKelv - 273.15f));
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
        return "Aktuelle Temperatur in Celsius: " + this.getTempCels();
    }

    /**
     * Zwei Temperatur-Objekte werden aufgrund ihrer Temperatur verglichen
     */
    @Override
    public int compareTo(Temperatur o) {
        return Double.compare(this.getTempCels(), o.getTempCels());
    }

}
