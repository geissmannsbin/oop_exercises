package ch.hslu.sw07;

public class Quecksilber extends Element {
    private static final double meltingPoint = -38.83;
    private static final double boilingpoint = 357;

    public Quecksilber(String name, double tempCel) {
        super(name, meltingPoint, boilingpoint, tempCel);
    }

    @Override
    public String toString() {
        return super.toString() + " -- Achtung GIFTIG";
    }
}
