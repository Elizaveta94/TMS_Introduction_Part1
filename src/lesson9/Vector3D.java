package lesson9;

public class Vector3D extends Vector2D {
    private static final String VECTOR_NAME = "3D Vector";

    public Vector3D(int x, int y) {
        super(x, y);
    }

    private int z;

    public Vector3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double length() {
        return (Math.sqrt(Math.pow(getX(), 2)) + (Math.pow(getY(), 2)) + (Math.pow(z, 2)));
    }

    public int scalar(Vector3D vector3D) {
        return getX() * vector3D.getX() + getY() * vector3D.getY() + z * vector3D.getZ();
    }

    public Vector3D sum(Vector3D vector3D) {
        int x3 = getX() + vector3D.getX();
        int y3 = getY() + vector3D.getY();
        int z3 = z + vector3D.getZ();
        return new Vector3D(x3, y3, z3);
    }

    public Vector3D sub(Vector3D vector3D) {
        int x3 = getX() - vector3D.getX();
        int y3 = getY() - vector3D.getY();
        int z3 = z - vector3D.getZ();
        return new Vector3D(x3, y3, z3);
    }

    public static Vector3D[] arr(int n) {
        Vector3D array[] = new Vector3D[n];
        System.out.println("Array of random 3D vector of size n :");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector3D((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        return array;
    }

    @Override
    public void print() {
        System.out.println(VECTOR_NAME + ": (" + getX() + ";" + getY() + ";" + z + ")");
    }
}
