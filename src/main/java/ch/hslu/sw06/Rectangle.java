package ch.hslu.sw06;

public final class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(final int x, final int y, final int width, final int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public final void changeDimension(final int newWidth, final int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }

    public final int getWidth(){
        return this.width;
    }

    public final int getHeight(){
        return this.height;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public final int getPerimeter(){
        return 2 * height + 2 * width;
    }

    @Override
    public final int getArea(){
        return height * width;
    }
}