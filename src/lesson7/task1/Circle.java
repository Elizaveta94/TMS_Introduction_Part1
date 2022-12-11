package lesson7.task1;

public class Circle extends Figure {
    int d;

    public Circle(int d) {
        this.d = d;
    }

    @Override
    public double perimeter() {
        return Math.PI * d;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(d, 2)) / 4;
    }
}