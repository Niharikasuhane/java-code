import java.util.*;
public class Operating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter job " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        // Sum
        int p = 0;

        for (int n = 0; n < 4; n++) {
            p = p + arr[n];
        }
          int m = 0;

        for (int j = 0; j < 5; j++) {
            m = m + arr[j];
        }

        // Average
        int k = arr.length;
        double average = (double) p / k;
         double averageTurn = (double) m / k;

        System.out.println("Average = " + average);
                System.out.println("AverageTurn = " + averageTurn);

    }
}