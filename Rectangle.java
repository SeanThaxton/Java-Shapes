public class Rectangle extends Shape implements Resizeable {
    // Properties unique to a retangle
    int length;
    int height;

    //The constructor for a rectangle
    public Rectangle(String name, String color, int length, int height){
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
    }
    // interface Implementation
    @Override
    public void resize(int percent) {
    this.length = length + (length* percent / 100);
    this.height = height +  (height*percent / 100);
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
