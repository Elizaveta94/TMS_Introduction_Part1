package lesson9;

public class Vector2D {
    private static final String VECTOR_NAME = "2D Vector";
    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double length() {
        return (Math.sqrt(Math.pow(x, 2)) + (Math.pow(y, 2)));
    }

    public int scalar(Vector2D vector2D) {
        return x * vector2D.getX() + y * vector2D.getY();
    }

    public Vector2D sum(Vector2D vector2D) {
        int x3 = x + vector2D.getX();
        int y3 = y + vector2D.getY();
        return new Vector2D(x3, y3);
    }

    public Vector2D sub(Vector2D vector2D) {
        int x3 = x - vector2D.getX();
        int y3 = y - vector2D.getY();
        return new Vector2D(x3, y3);
    }

    public static Vector2D[] arr(int n) {
        Vector2D array[] = new Vector2D[n];
        System.out.println("Array of random 2D vector of size n :");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector2D((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        return array;
    }

    public void print() {
        System.out.println(VECTOR_NAME + ": (" + x + ";" + y + ")");
    }
}
