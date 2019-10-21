package ch.hslu.sw02;

/**
 * This class is used to store temperature values
 *
 * Please see the {@link ch.hslu.sw02} class for true identity
 * @author robin
 */

public class Temperatur {

    private double umgebungsTemperaturCelsius;

    public Temperatur(final double umgebungsTemperaturCelsius) {
        this.umgebungsTemperaturCelsius = umgebungsTemperaturCelsius;
    }

    public Temperatur() {
        umgebungsTemperaturCelsius = 20;
    }

    public double getUmgebungsTemperaturCelsius() {
        return umgebungsTemperaturCelsius;
    }

    public double getUmgebungsTemperaturKelvin() {
        return umgebungsTemperaturCelsius + 273.15;
    }

    public double getUmgebungsTemperatbburFarenheit() {
        return umgebungsTemperaturCelsius * 1.8 + 32;
    }

    public void setUmgebungsTemperaturCelsius(final double umgebungsTemperaturCelsius) {
        this.umgebungsTemperaturCelsius = umgebungsTemperaturCelsius;
    }

    public void warmerCelsius(final double increment) {
        umgebungsTemperaturCelsius += increment;
    }

    public void colderCelsius(final double decrement) {
        umgebungsTemperaturCelsius -= decrement;
    }
}
