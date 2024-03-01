// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape Square = shapeFactory.getShape("Square");
        Square.draw();
        Shape Rectangle = shapeFactory.getShape("Rectangle");
        Rectangle.draw();
        Shape Triangle = shapeFactory.getShape("Triangle");
        Triangle.draw();
    }
}