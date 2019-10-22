package ch.hslu.sw06;

/**
 * Semesterwoche 6 Übungen
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

    final void move(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public abstract int getPerimeter();

    public abstract int getArea();
}