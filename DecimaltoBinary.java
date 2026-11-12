import java.util.Scanner;

public class DecimalToBinary {
    // Recursive method to convert decimal to binary string
    public String convert(int n) {
        if (n == 0) {
            return "";
        }
        return convert(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        DecimalToBinary obj = new DecimalToBinary();
        if (n == 0) {
            System.out.println("Binary: 0");
        } else {
            System.out.println("Binary: " + obj.convert(n));
        }
    }
}
