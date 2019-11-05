package ch.hslu.sw07;

import java.util.Objects;

/**
 * Person with a unique ID
 * @author Robin Geissmann
 */
public class Person implements Comparable<Person> {
    private final long id;
    private String firstName;
    private String lastName;

    /**
     * Constructor
     * @param id
     * @param firstName
     * @param lastName
     */
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return firstName
     */
    public String getfirstName() {
        return firstName;
    }

    /**
     * @return lastName
     */
    public String getlastName() {
        return lastName;
    }

    /**
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return object.toString()
     */
    @Override
    public final String toString() {
        return "Person-Objekt mit Namen: " + this.firstName + " und Nachnamen: " + this.lastName + " und ID: " + this.id;
    }

    /**
     *
     * @param o
     * @return boolean
     */
    @Override
    public final boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof Person)) {
            return false;
        }
        final Person testPerson = (Person) o;
        return (testPerson.id == this.id) && (Objects.equals(this.firstName, testPerson.firstName)) && (Objects.equals(this.lastName, testPerson.lastName));
    }

    /**
     *
     * @return hash value of the object
     */
    @Override
    public final int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    /**
     * Two persons are equal if their ID is equal
     */
    @Override
    public final int compareTo(Person o) {
        return Long.compare(this.id, o.id);
    }
}