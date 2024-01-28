import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        float[] fraction = {1.57f, 7.654f, 9.986f};
        System.out.println(fraction[0]);
        System.out.println(fraction[1]);
        System.out.println(fraction[2]);

        int[] birds = {1, 2, 3};
        System.out.println(birds[0]);
        System.out.println(birds[1]);
        System.out.println(birds[2]);

        System.out.println("Задача 2");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        float[] a = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        int[] t = {1, 2, 3};
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i != t.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        System.out.println("Задача 3");

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

        System.out.println(" ");

        System.out.println("Задача 4");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}