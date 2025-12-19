import java.util.Scanner;

public class ReverseDigits{
    public static int reverseDigits(int n){
        if (n==0) return 0;
    

        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        int rev = 0;
        
        while(n>0){
            rev = rev * 10 + (n%10);
            n /= 10;  
        }
        return rev * sign;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseDigits(n));
        sc.close();
    }   
    }
