import java.util.Scanner;

public class PalindromeNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int original = N;
        int reversed = 0;

        while (N > 0){
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N = N / 10;
        }
         if (original == reversed){
        System.out.println("Palindrome Number");
    }
    else{
        System.out.println("Not Palindrome");
    }
    }
   
}