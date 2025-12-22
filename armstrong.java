import java.util.*;

public class armstrong{
    private static long intPow(int base, int exp){
        long result = 1;
        
        for(int i = 0; i < exp; i++){
            result *= base;
        }
        return result;
    }

public static boolean isArmstrong(long n){
    if(n<0) return false;
    if (n==0) return true;

    long temp = n;
    int digits = 0;
    while (temp>0){
        digits++;
        temp /= 10;
    }

    long sum = 0;
    temp = n;
    while(temp>0 ){
        int d = (int)(temp%10);
            sum += intPow(d, digits);
        if(sum>n && digits > 1){
            return false;
        }
        temp /= 10;
    }
    return sum == n;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNextLong()){
        System.out.println("false");
        sc.close();
        return;
    }
    long n = sc.nextLong();
    sc.close();
    System.out.println(isArmstrong(n));
}
}
