import java.util.Scanner;

public class ArraySum {
    // Recursive method to sum elements of an array
    public int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 15};
        ArraySum obj = new ArraySum();
        int total = obj.sum(arr, arr.length);
        System.out.println("Sum of array elements: " + total);
    }
}
