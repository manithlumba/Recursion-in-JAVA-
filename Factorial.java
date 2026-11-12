import java.util.Scanner;

public class Factorial {
    // Recursive method to calculate factorial
    public long findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();
        long result = obj.findFactorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
