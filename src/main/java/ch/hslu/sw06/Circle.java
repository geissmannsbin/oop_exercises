package ch.hslu.sw06;

public final class Circle extends Shape {

    private int diameter;

    Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public final void setDiameter(final int diameter) {
        this.diameter = diameter;
    }

    final int getDiameter() {
        return this.diameter;
    }

    @Override
    public int getX() {
        return super.x;
    }

    @Override
    public int getY() {
        return super.y;
    }

    @Override
    public final int getPerimeter() {
        return (int) (Math.PI * 2 * diameter / 2);
    }

    @Override
    public final int getArea() {
        return (int) Math.PI * (int) Math.pow(diameter / 2, 2);
    }
}
