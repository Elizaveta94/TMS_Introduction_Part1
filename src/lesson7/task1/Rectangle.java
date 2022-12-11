package lesson7.task1;

public class Rectangle extends Figure {
    int a;
    int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public double area() {
        return a * b;
    }
}
