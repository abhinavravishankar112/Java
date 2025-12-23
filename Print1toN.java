import java.util.Scanner;

public class Print1toN {
    
    // Recursive method to print numbers from 1 to N
    public static void printNumbers(int n) {
        // Base case: if n becomes 0, stop the recursion
        if (n == 0) {
            return;
        }
        
        // Recursive call first (to print 1 to n-1)
        printNumbers(n - 1);
        
        // Then print the current number
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter N (number up to which to print): ");
        int n = sc.nextInt();
        
        System.out.println("\nPrinting numbers from 1 to " + n + " using recursion:");
        printNumbers(n);
        
        sc.close();
    }
}
