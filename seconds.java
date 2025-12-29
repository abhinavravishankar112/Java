import java.util.Scanner;

public class SecondSmallestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];

            // Smallest & second smallest
            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val > smallest && val < secondSmallest) {
                secondSmallest = val;
            }

            // Largest & second largest
            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } else if (val < largest && val > secondLargest) {
                secondLargest = val;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest : -1");
        } else {
            System.out.println("Second Smallest : " + secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest : -1");
        } else {
            System.out.println("Second Largest : " + secondLargest);
        }
    }
}
