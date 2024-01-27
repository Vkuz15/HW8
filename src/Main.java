import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Здача 1

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        float[] i = {1.57f, 7.654f, 9.986f};
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);

        int[] birds = {1, 2, 3};
        System.out.println(birds[0]);
        System.out.println(birds[1]);
        System.out.println(birds[2]);

        //Задача 2

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        System.out.println(" ");

        float[] a = {1.57f, 7.654f, 9.986f};
        System.out.print(a[0] + ", " + a[1] + ", " + a[2]);

        System.out.println(" ");

        int[] t = {1, 2, 3};
        System.out.print(t[0] + ", " + t[1] + ", " + t[2]);

        System.out.println(" ");

        //Задача 3

        int[] h = new int[3];
        h[0] = 3;
        h[1] = 2;
        h[2] = 1;
        System.out.print(Arrays.toString(h));

        System.out.println(" ");

        float[] b = {9.986f, 7.654f, 1.57f};
        System.out.print(Arrays.toString(b));

        System.out.println(" ");

        int[] r = {3, 2, 1};
        System.out.print(Arrays.toString(r));
    }
}