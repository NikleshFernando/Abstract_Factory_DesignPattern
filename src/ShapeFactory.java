public class ShapeFactory {

    public Shape getShape(String type){

        if(type==null){
            return null;
        }
        if(type == "Circle"){
            return new Circle();
        } else if (type == "Triangle") {
            return new Triangle();
        } else if (type == "Rectangle") {
            return new Rectangle();
        } else if (type == "Square") {
            return new Square();
        }
        return null;
    }
}
