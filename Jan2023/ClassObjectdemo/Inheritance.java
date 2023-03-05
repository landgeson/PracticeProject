
class Shape {
   public void area() {
      System.out.println("Display area");
   }
}

class Triangle extends Shape {
   public void area(int l, int h) {
      System.out.println(0.5 * l * h);
   }
}

class Equilateral extends Triangle {
   public void area(int l, int h) {
      System.out.println(0.5 * l * h);
   }
}

class Circle extends Shape {
   public void area(int r) {
      System.out.println(3.14 * r * r);
   }
}

public class Inheritance {
   public static void main(String[] args) {
      Shape s = new Shape();
      s.area();

      Triangle t = new Triangle();
      t.area(10, 5);

      Equilateral e = new Equilateral();
      e.area(10, 5);

      Circle c = new Circle();
      c.area(5);
   }
}