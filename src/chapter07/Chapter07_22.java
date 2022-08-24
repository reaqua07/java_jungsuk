package chapter07;

public class Chapter07_22 {

    public static double sumArea(Shape[] arr) {
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i].calcArea();
        }

        return result;
    }

    public static void main(String args[]) {

//        Point p = new Point();
//
//        double r = 3;
//        Circle c = new Circle(p, 3);
//
//        Rectangle rt = new Rectangle(p, 3, 4);
//
//        System.out.println(c.calcArea());
//        System.out.println(rt.calcArea());
//        System.out.println(rt.isSquare());

        Shape[] arr = {
                new Circle(5.0), new Rectangle(3, 4), new Circle(1)
        };

        System.out.println("면적의 합 : " + sumArea(arr));


    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    // 면적
    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[ " + x + " , " + y + " ]";
    }
}


class Circle extends Shape {

    // 반지름
    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width * height;
    }

    // 정사각형인지
    boolean isSquare() {
        return width == height;
    }
}

