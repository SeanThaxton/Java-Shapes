public class Triangle extends Shape implements Resizeable{
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

      // interface Implementation
      @Override
      public void resize(int percent) {
      this.base = this.base * (percent / 100);
      this.height = this.height * (percent / 100);
      this.a = this.a * (percent / 100);
      this.b = this.b * (percent / 100);
      this.c = this.c * (percent / 100);
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
