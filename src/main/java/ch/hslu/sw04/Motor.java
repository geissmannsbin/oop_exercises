package ch.hslu.sw04;

/**
 *
 */
public final class Motor implements Switchable {
    private int rpm;

    Motor(){
        this.rpm = 0;
    }

    @Override
    public void switchOn() {
        if (this.isSwitchedOff()){
            this.rpm = 500;
        }
    }

    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            this.rpm = 0;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return rpm == 0;
    }
}
