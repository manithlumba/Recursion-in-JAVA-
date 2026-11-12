import java.util.Scanner;

public class BinarySearch {
    // Recursive binary search method
    public int search(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return search(arr, low, mid - 1, key);
        } else {
            return search(arr, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        BinarySearch obj = new BinarySearch();
        int idx = obj.search(arr, 0, arr.length - 1, key);

        if (idx != -1) {
            System.out.println("Element found at index: " + idx);
        } else {
            System.out.println("Element not found.");
        }
    }
}
