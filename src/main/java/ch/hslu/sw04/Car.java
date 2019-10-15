package ch.hslu.sw04;

import java.lang.management.MemoryType;

public final class Car implements CountingSwitchable, Named {

    private Cabinlight fahrerLicht;
    private Headlight frontScheinwerfer;
    private Motor motor;
    private long switchCount;
    private String name;


    Car(String name){
        fahrerLicht = new Cabinlight();
        frontScheinwerfer = new Headlight();
        motor = new Motor();
        switchCount = 0;
        setName(name);
    }

    @Override
    public void switchOn() {
        if(motor.isSwitchedOff()) {
            motor.switchOn();
            frontScheinwerfer.switchOn();
            fahrerLicht.switchOff();
            switchCount++;
        }
    }

    @Override
    public void switchOff() {
        if(motor.isSwitchedOn()){
            motor.switchOff();
            frontScheinwerfer.switchOff();
            fahrerLicht.switchOn();
            switchCount++;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return motor.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return motor.isSwitchedOff();
    }

    @Override
    public long getSwitchCount() {
        return switchCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
