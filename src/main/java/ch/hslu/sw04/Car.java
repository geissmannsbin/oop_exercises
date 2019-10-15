package ch.hslu.sw04;

import java.lang.management.MemoryType;

public final class Car implements Switchable {

    private Cabinlight fahrerLicht;
    private Headlight frontScheinwerfer;
    private Motor motor;

    public Car(){
        fahrerLicht = new Cabinlight();
        frontScheinwerfer = new Headlight();
        motor = new Motor();
    }

    @Override
    public void switchOn() {
        if(motor.isSwitchedOff()) {
            motor.switchOn();
            frontScheinwerfer.switchOn();
            fahrerLicht.switchOff();
        }
    }

    @Override
    public void switchOff() {
        if(motor.isSwitchedOn()){
            motor.switchOff();
            frontScheinwerfer.switchOff();
            fahrerLicht.switchOn();
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
}
