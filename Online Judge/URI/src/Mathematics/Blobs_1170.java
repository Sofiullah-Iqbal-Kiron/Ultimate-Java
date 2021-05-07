// Accepted


package Mathematics;

import java.util.Scanner;

public class Blobs_1170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            double x = input.nextDouble();
            int dias = 0;
            while (x > 1) {
                x /= 2;
                dias++;
            }
            System.out.format("%d dias\n", dias);
        }
    }
}