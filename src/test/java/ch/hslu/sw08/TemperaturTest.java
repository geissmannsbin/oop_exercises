package ch.hslu.sw08;

import static org.junit.jupiter.api.Assertions.*;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

class TemperaturTest {
    private Temperatur temperatur = new Temperatur(defaultTemp);
    private static final float defaultTemp = 35.5f;

    @Test
    void convertCelsiusToKelvinTest(){ assertEquals(Temperatur.convertCelsiusToKelvin(defaultTemp), defaultTemp + 273.15f);}

    @Test
    void convertKelvinToCelsiusTest(){ assertEquals(Temperatur.convertKelvinToCelsius(defaultTemp + 273.15f), defaultTemp);}

    @Test
    void getTempCelsius() {
        assertEquals(defaultTemp, temperatur.getCelsius());
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testHashCodeEqual(){
        Temperatur temperatur1 = new Temperatur(defaultTemp);
        if (temperatur.equals(temperatur1)){
            assertEquals(temperatur.hashCode(), temperatur1.hashCode());
        }
    }

    @Test
    void testHashCodeNotEqual(){
        Temperatur temperatur1 = new Temperatur(28.6f);
        if (!temperatur.equals(temperatur1)){
            assertNotEquals(temperatur.hashCode(), temperatur1.hashCode());
        }
    }
    @Test
    void testEquals() {
        Temperatur temperatur1 = new Temperatur(55f);
    }

    @Test
    void testHashCode() {
    }
}