public class Circle extends Shape {
    // Properties unique to a circle
    int radius;

    //The constructor for a circle
    public Circle(String name, String color, int radius){
        this.name = name;
        this.color = color;
        this.radius = radius;

    }

    //Inherited method implimentation
    @Override
    int calculateArea() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    int calculatePerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }
}
