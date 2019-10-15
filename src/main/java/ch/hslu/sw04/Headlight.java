package ch.hslu.sw04;

public final class Headlight implements Switchable, Dimmable {

    private int lumen;

    Headlight() {
        this.lumen = 0;
    }

    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            this.lumen = 500;
        }
    }

    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            this.lumen = 0;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return lumen > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return lumen == 0;
    }

    @Override
    public int getLumen() {
        return this.lumen;
    }

    @Override
    public void setLumen(final int lumen) {
        this.lumen = lumen;
    }
}
