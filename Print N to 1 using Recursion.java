class Solution {
    // Recursive function to print numbers from current down to 1
    public void printNumbers(int current) {
        // Base case: if current is less than 1, stop recursion
        if (current < 1)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next smaller number
        printNumbers(current - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}
