package lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(5, 5, 4);
        System.out.println("Perimeter for triangle: " + triangle.perimeter());
        System.out.println("Area for triangle: " + triangle.area());
        Figure rectangle = new Rectangle(3, 5);
        System.out.println("Perimeter for rectangle: " + rectangle.perimeter());
        System.out.println("Area for rectangle: " + rectangle.area());
        Figure circle = new Circle(5);
        System.out.println("Perimeter for circle: " + circle.perimeter());
        System.out.println("Area for circle: " + circle.area());

        Figure[] figures = {new Triangle(5, 5, 4), new Rectangle(3, 5), new Circle(5),
                new Triangle(5, 5, 4), new Rectangle(3, 5)};
        double sum = 0;
        for (Figure i: figures) {
            sum += i.perimeter();
        }
        System.out.println("Sum= " + sum);

    }

}
