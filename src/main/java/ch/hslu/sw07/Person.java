package ch.hslu.sw07;

import java.util.Objects;

/**
 * Person with a unique ID
 * @author Robin Geissmann
 */
public class Person implements Comparable<Person>, Sleepable {
    private final long id;
    private boolean isAwake;
    private String firstName;
    private String lastName;

    public Person(long id, String first, String last) {
        this.id = id;
        this.firstName = first;
        this.lastName = last;
    }

    /**
     * @return the firstName
     */
    public String getfirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getlastName() {
        return lastName;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    @Override
    public final String toString() {
        return "Person-Objekt mit Namen: " + this.firstName + " und Nachnamen: " + this.lastName + " und ID: " + this.id;
    }

    /**
     * Override of the Object .equals()-Method. Two Person-Objects are only
     * equal, if they're of the same type and have the same id.
     */
    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Person) {
            final Person person = (Person) obj;
            if (person.getId() == this.getId()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     *  Two persons are equal if their ID is equal
     */
    @Override
    public final int hashCode() {
        return Objects.hash(this.id, 100);
    }

    /**
     * Two persons are equal if their ID is equal
     */
    @Override
    public final int compareTo(Person o) {
        return Long.compare(this.id, o.id);
    }

    /**
     * Is awake?
     */
    @Override
    public boolean isAwake() {
        return this.isAwake;
    }

    /**
     * Send to Sleep
     */
    @Override
    public void sendToSleep() {
        this.isAwake = false;
    }

    /**
     * Wake Up.
     */
    @Override
    public void wakeUp() {
        this.isAwake = true;
    }
}