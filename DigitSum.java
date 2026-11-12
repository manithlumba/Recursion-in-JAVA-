import java.util.Scanner;

public class DigitSum {
    // Recursive method to find sum of digits
    public int findDigitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + findDigitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        DigitSum obj = new DigitSum();
        System.out.println("Sum of digits: " + obj.findDigitSum(num));
    }
}
