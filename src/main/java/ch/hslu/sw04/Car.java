package ch.hslu.sw04;

import java.lang.management.MemoryType;

public final class Car implements CountingSwitchable {

    private Cabinlight fahrerLicht;
    private Headlight frontScheinwerfer;
    private Motor motor;
    private long switchCount;


    Car(){
        fahrerLicht = new Cabinlight();
        frontScheinwerfer = new Headlight();
        motor = new Motor();
        switchCount = 0;
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
}
