import java.util.Scanner;

public class PrintNTimes {
    
    // Recursive method to print name N times
    public static void printNameNTimes(String name, int n) {
        // Base case: if n becomes 0, stop the recursion
        if (n == 0) {
            return;
        }
        
        // Print the name
        System.out.println(name);
        
        // Recursive call with n-1
        printNameNTimes(name, n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter N (number of times to print): ");
        int n = sc.nextInt();
        
        System.out.println("\nPrinting name " + n + " times using recursion:");
        printNameNTimes(name, n);
        
        sc.close();
    }
}
