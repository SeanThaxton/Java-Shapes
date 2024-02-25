public class Triangle extends Shape {
    // Properties unique to a triangle
    int base;
    int height;
    int a,b,c;


    //The constructor for a triangle
    public Triangle(String name, String color, int base, int height, int a, int b, int c){
        this.name = name;
        this.color =color;
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Inherited method implimentation
    @Override
    double calculateArea() {
        return ((1/2) * base) * height;
    }
    @Override
    double calculatePerimeter() {
     return a + b + c;
    }
}
