import java.util.Scanner;

public class Fibonacci {
    // Recursive method to get Nth Fibonacci number
    public int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (N): ");
        int n = sc.nextInt();

        Fibonacci obj = new Fibonacci();
        System.out.println("Fibonacci term at position " + n + " is: " + obj.getFibonacci(n));
    }
}
