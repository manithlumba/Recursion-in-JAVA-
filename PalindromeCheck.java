import java.util.Scanner;

public class PalindromeCheck {
    // Recursive method to check palindrome status
    public boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        PalindromeCheck obj = new PalindromeCheck();
        if (obj.isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}
