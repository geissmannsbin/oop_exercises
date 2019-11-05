package ch.hslu.sw07;

public class Stickstoff extends Element {
    private static final double meltingPoint = -210.1;
    private static final double boilingPoint = -196;

    public Stickstoff(String name, double tempCel) {
        super(name, meltingPoint, boilingPoint, tempCel);
    }
}