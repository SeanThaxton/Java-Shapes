public class ShapeTest {

    //Where the program starts
    public static void main(String[] args) {
        Circle myCircle = new Circle("Circle", "Blue", 5);
        Rectangle myRectangle = new Rectangle("Rectangle", "Red", 5, 10);
        Square mySquare = new Square("Square", "Green" ,5);
        Triangle myTriangle = new Triangle("Triangle", "Orange", 10, 8, 5, 5, 5);

        System.out.println("Circle");
        System.out.println("-----------");
        System.out.println(("Name: " + myCircle.name));
        System.out.println("Color: " + myCircle.color);
        System.out.println("Radius: " + myCircle.radius);
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Perimeter: " + myCircle.calculatePerimeter());
        myCircle.resize(50);
        System.out.println("The radius after 50% resize is: " + myCircle.radius);

        System.out.println("\nRectangle");
        System.out.println("-----------");
        System.out.println("Name: " + myRectangle.name);
        System.out.println("Color " + myRectangle.color);
        System.out.println("Length: " + myRectangle.length);
        System.out.println("Width: " + myRectangle.height);
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
        myRectangle.resize(50);
        System.out.println("The length and width after 50% resize is: " + myRectangle.length + " and " + myRectangle.height);

        System.out.println("\nSquare");
        System.out.println("-----------");
        System.out.println("Name: " + mySquare.name);
        System.out.println("Color: " + mySquare.color);
        System.out.println("Side: " + mySquare.length);
        System.out.println("Area: " + mySquare.calculateArea());
        System.out.println("Perimeter: " + mySquare.calculatePerimeter());
        mySquare.resize(50);
        System.out.println("The side after 50% resize is: " + mySquare.length);

        System.out.println("\nTriangle");
        System.out.println("-----------");
        System.out.println("Name: " + myTriangle.name);
        System.out.println("Color: " + myTriangle.color);
        System.out.println("Side 1: " + myTriangle.a);
        System.out.println("Side 2: " + myTriangle.b);
        System.out.println("Side 3: " + myTriangle.c);
        System.out.println("Base: " + myTriangle.base);
        System.out.println("Height: " + myTriangle.height);
        System.out.println("Area: " + myTriangle.calculateArea());
        System.out.println("Perimeter: " + myTriangle.calculatePerimeter());
        myTriangle.resize(50);
        System.out.println("The sides, base, and height after 50% resize is: " + myTriangle.a + ", " + myTriangle.b + ", " + myTriangle.c + ", " + myTriangle.base + ", and " + myTriangle.height);

    }
}
