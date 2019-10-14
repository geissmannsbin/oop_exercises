package ch.hslu.sw05;

/**
 * Semesterwoche 5 Übungen
 *
 */
public abstract class Shape {

    protected int x;
    protected int y;

    Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getX();

    public abstract int getY();

    public final void move (int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public abstract int getPerimeter();

    public abstract int getArea();
}