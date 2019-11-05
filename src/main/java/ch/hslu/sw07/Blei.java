package ch.hslu.sw07;

import java.util.Objects;

public class Blei extends Element {
    private static final double meltingPoint = 327.43;
    private static final double boilingPoint = 1744;

    public Blei(String name, int tempCel) {
        super(name, meltingPoint, boilingPoint, tempCel);
    }
}