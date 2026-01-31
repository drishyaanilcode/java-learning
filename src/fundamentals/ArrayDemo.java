package fundamentals;
import java.util.Arrays;

public class ArrayDemo{

public static void main(String[] args) {
    int[] data = {10, 50, 30, 20, 40};
    Arrays.sort(data);
    System.out.println("Sorted Array: " + Arrays.toString(data));

    int[][] matrix = {{1, 2}, {3, 4}};
    System.out.println("2D Element: " + matrix[1][0]);
}
}
