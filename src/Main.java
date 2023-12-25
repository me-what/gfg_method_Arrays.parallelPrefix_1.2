import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.parallelPrefix(arr, (x, y) -> {
            if (x < y)
                return x + y;
            else
                return x - y;
        });

        System.out.println("Example 1: with Primitive type");
        Arrays.stream(arr).forEach(e -> System.out.print(e + "   "));
        System.out.println();


        // 2
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.parallelPrefix(arr1, (x, y) -> x * y);
        System.out.println("\nExample 2: with primitives");

        Arrays.stream(arr1).forEach(e -> System.out.print(e + "   "));
        System.out.println();


        // 3
        int[] arr2 = { 1, 2, 4, 8, 5, 9, 6, 8, 9, 10, 11 };

        Arrays.parallelPrefix(arr2, 2, 8, (x, y) -> {
            if (x % 2 == 0 && y % 2 == 0)
                return x;
            else
                return y;
        });

        System.out.println("\nExample: Making Changes in the "
                +"specified range of element in an Array");
        Arrays.stream(arr2).forEach(e -> System.out.print(e + "   "));
    }
}