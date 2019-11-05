package ch.hslu.sw07;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person = new Person(id, firstName, lastName);
    private static final long id = 349502;
    private static final String firstName = "Robin";
    private static final String lastName = "Geissmann";


    @Test
    void getFirstname() {
        assertEquals(firstName, person.getfirstName());
    }

    @Test
    void getLastname() {
        assertEquals(lastName, person.getlastName());
    }

    @Test
    void getId() {
        assertEquals(id, person.getId());
    }

    @Test
    void testToString() {
        assertEquals("Person-Objekt mit Namen: Robin und Nachnamen: Geissmann und ID: 349502", person.toString());
    }

    @Test
    void testEquals() {
        Person person1 = new Person(823842, "Peter", "Lustig");
    }

    @Test
    void testHashCodeEqual() {
        Person person1 = new Person(349502, "Robin", "Geissmann");
        if (person.equals(person1)) {
            assertEquals(person.hashCode(), person1.hashCode());
        }
    }

    @Test
    void testHashCodeNotEqual(){
        Person person1 = new Person(32942, "Peter", "Witziger");
        if(!person.equals(person1)){
            assertNotEquals(person.hashCode(), person1.hashCode());
        }
    }

    @Test
    void compareToTest(){
        assertTrue(person.compareTo(new Person(23455L, "Marco", "Polo")) > 0);
    }
}