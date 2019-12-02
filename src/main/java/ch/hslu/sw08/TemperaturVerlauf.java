package ch.hslu.sw08;

import java.util.ArrayList;

public class TemperaturVerlauf extends ArrayList<Temperatur> {

    private Object temperaturVerlauf[];

    public TemperaturVerlauf(Object[] temperaturVerlauf) {
        this.temperaturVerlauf = temperaturVerlauf;
    }

    public TemperaturVerlauf(){
        
    }

    @Override
    public boolean add(Temperatur temperatur){

    }
}
