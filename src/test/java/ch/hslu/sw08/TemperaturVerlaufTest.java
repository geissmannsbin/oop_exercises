package ch.hslu.sw08;

class TemperaturVerlaufTest {

    void addTemperaturToTemperaturVerlauf(){
        TemperaturVerlauf TestVerlauf = new TemperaturVerlauf(elements);
        Temperatur Temperatur1 = new Temperatur();

        TemperaturVerlauf.add(Temperatur1);
    }

}