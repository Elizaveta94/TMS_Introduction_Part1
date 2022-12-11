package lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(2, 4);
        Vector3D a1 = new Vector3D(2, 1, 5);
        a.print();
        a1.print();
        System.out.println("2D vector length: " + a.length());
        System.out.println("3D vector length: " + a1.length());
        System.out.println("Scalar product of numbers for 2D vector: " + a.scalar(a));
        System.out.println("Scalar product of numbers for 3D vector: " + a1.scalar(a1));
        Vector2D b = new Vector2D(4, 2);
        Vector2D ab = a.sum(b);
        Vector2D ba = a.sub(b);
        System.out.println("Addition for 2D vector: ");
        ab.print();
        System.out.println("Subtraction for 2D vector");
        ba.print();
        Vector3D b1 = new Vector3D(4, 2, 5);
        Vector3D ab1 = a1.sum(b1);
        Vector3D ba1 = a1.sub(b1);
        System.out.println("Addition for 3D vector: ");
        ab1.print();
        System.out.println("Subtraction for 3D vector: ");
        ba1.print();
        Vector2D[] array = Vector2D.arr(5);
        for (Vector2D v : array) {
            v.print();
        }
        Vector3D[] array1 = Vector3D.arr(3);
        for (Vector3D v : array1) {
            v.print();
        }
    }
}
