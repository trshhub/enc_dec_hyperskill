abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double p = getPerimeter() * 0.5; //half perimeter

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

/*
class TestMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(10);

        System.out.println(circle.getPerimeter() + ", " + circle.getArea());
        System.out.println(triangle.getPerimeter() + ", " + triangle.getArea());
        System.out.println(rectangle.getPerimeter() + ", " + rectangle.getArea());
    }
}*/
