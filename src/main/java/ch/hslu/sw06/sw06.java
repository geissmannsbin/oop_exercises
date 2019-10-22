package ch.hslu.sw06;

public final class sw06 {
    public static void main(final String[] args) {

        Shape shape01 = new Circle(5, 5, 8);

        Shape shape02 = new Rectangle(5, 6, 8, 9 );

        shape02.move(5, 6);

        int diameter = ((Circle) shape01).getDiameter(); /* This is called Dowcasting and enables the compiler to access the method of the subclass  */
    }
}
