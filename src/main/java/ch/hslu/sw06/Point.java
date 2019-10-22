package ch.hslu.sw06;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public void moveRelative(final int x, final int y){
        this.x += x;
        this.y += y;
    }

    public void moveRelative(final Point point){
        this.x += point.x;
        this.y += point.y;
    }

    public void moveRelative(double angle, int distance){
        this.x += Math.sin(angle) * distance;
        this.y += Math.cos(angle) * distance;
    }
}