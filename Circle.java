public class Circle extends Shape implements Resizeable {
    // Properties unique to a circle
    int radius;

    //The constructor for a circle
    public Circle(String name, String color, int radius){
        this.name = name;
        this.color = color;
        this.radius = radius;

    }
    // Interface implimentation
    @Override
    public void resize(int percent) {
        this.radius = radius + (radius * percent/100);
    }
    
    //Inherited method implimentation
    @Override
    double calculateArea() {
        return 3.14 * (radius * radius);
    }
    @Override
    double calculatePerimeter() {
        return 2 * radius;
    }
}
