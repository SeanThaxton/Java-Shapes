public class Square extends Shape {
    // Properties unique to a retangle
    int length, height;

    //The constructor for a square
    public Square(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.length = size;
        this.height = size;
    }

    //Inherited method implimentation
    @Override
    double calculateArea() {
        return length * height;
    }
    @Override
    double calculatePerimeter() {
        return (2 * length) + (2 * height);
    }
}
