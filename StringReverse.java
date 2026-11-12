import java.util.Scanner;

public class StringReverse {
    // Recursive method to reverse a string
    public String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringReverse obj = new StringReverse();
        System.out.println("Reversed string: " + obj.reverse(str));
    }
}
