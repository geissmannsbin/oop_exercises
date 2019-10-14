package ch.hslu.sw05;

public final class Square extends Shape {

    private int height;

    public Square(final int x, final int y, final int height){
        super(x,y);
        this.height = height;
    }

    public final void changeDimension(final int newHeight){
        this.height = newHeight;
    }

    public final int getHeight(){
        return this.height;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getPerimeter() {
        return height * 4;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(height, 2);
    }
}
