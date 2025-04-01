package org.example.nds;


import org.w3c.dom.css.Rect;

public class MyFirstProgramm {
  public static void main() {
    hello("World");
    hello("all");
    Square s = new Square();
    Rectangle r = new Rectangle();
s.l = 5;
    double l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + area(s));
    System.out.println("Площадь прямоугольника со сторонами " + r.a + "и" + r.b + " равна " + area(r));

    r.a = 5;
    r.b = 10;

  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + ". mfkz! ");
  }

  public static double area (Square s) {
    return s.l * s.l;
  }
  public static double area (Rectangle r) {
      return r.a * r.b;
  }
}

