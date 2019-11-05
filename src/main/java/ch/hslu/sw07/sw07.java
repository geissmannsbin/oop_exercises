package ch.hslu.sw07;

import ch.hslu.sw06.Circle;
import ch.hslu.sw06.Rectangle;
import ch.hslu.sw06.Shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class sw07 {
    public static void main(final String[] args) {
        ArrayList<Person> PersonPile = makeAfewPeople(50);
        for (Person personLoop : PersonPile) {
            System.out.println(personLoop.toString());
        }
    }

    private static ArrayList<Person> makeAfewPeople(final int amount){
        int count = 0;
        ArrayList<Person> thePeople = new ArrayList<Person>();
        while (count <= amount) {
            Person personLoop = new Person(count + 1, "Max" + count, "Mustermann");
            thePeople.add(personLoop);
            count++;
        }

        Collections.sort(thePeople, Collections.reverseOrder());

        return thePeople;
    }

    private static ArrayList<Temperatur> makeAfewTemperatures(final int amount){
        int count = 0;
        ArrayList<Temperatur> theTemperatures = new ArrayList<>();
        while (count <= amount) {
            Temperatur temperaturLoop = new Temperatur(count + 1);
            theTemperatures.add(temperaturLoop);
            count++;
        }

        Collections.sort(theTemperatures, Collections.reverseOrder());

        return theTemperatures;
    }
}
