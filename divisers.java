import java.util.*;
public class divisers {
	public static void main(String[] args) {
		long n = new Scanner(System.in).nextLong();
		for (long i = 1; i * i <= n; i++) if (n % i == 0) System.out.print(i + " ");
		for (long i = (long) Math.sqrt(n); i > 0; i--) if (n % i == 0 && i * i != n) System.out.print(n / i + " ");
	}
}
