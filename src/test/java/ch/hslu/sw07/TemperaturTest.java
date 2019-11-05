package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import java.rmi.Remote;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {
    private Temperatur temperatur = new Temperatur(defaultTemp);
    private static final double defaultTemp = 35.5d;

    @Test
    void getTempCels() {
        assertEquals(defaultTemp, temperatur.getTempCels());
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
        Temperatur temperatur1 = new Temperatur(28.6d);
        if (!temperatur.equals(temperatur1)){
            assertNotEquals(temperatur.hashCode(), temperatur1.hashCode());
        }
    }
    @Test
    void testEquals() {
        Temperatur temperatur1 = new Temperatur(55d);
    }

    @Test
    void testHashCode() {
    }
}