import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int N) {
        if (N == 0) return 1;
        N = Math.abs(N);
        int count = 0;

        while (N > 0) {
            count++;
            N = N / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countDigits(N));
        sc.close();
    }
}
