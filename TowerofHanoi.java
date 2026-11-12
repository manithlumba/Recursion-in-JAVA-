import java.util.Scanner;

public class TowerOfHanoi {
    // Recursive method to solve Tower of Hanoi
    public void solve(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solve(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solve(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        TowerOfHanoi obj = new TowerOfHanoi();
        obj.solve(n, 'A', 'C', 'B');
    }
}
