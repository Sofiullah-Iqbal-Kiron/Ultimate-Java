// Accepted at 2'nd attempt
// Formula from: https://www.omnicalculator.com/physics/projectile-motion


package Mathematics;

import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class AngryDucks_1163 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (input.hasNextDouble()) {
            double h = input.nextDouble();
            int p1 = input.nextInt(), p2 = input.nextInt(), n = input.nextInt();
            for (int i = 0; i < n; i++) {
                double a = input.nextDouble(), v = input.nextDouble();
                double r = findRange(a, v, h, 9.80665);
                if (!(r >= p1 && r <= p2)) System.out.format("%.5f -> NUCK\n", r);
                else System.out.format("%.5f -> DUCK\n", r);
            }
        }
    }

    private static double findRange(double angle, double velocity, double height, double gravity) {
        double vx = velocity * cos(actualAngle(angle)), vy = velocity * sin(actualAngle(angle));

        return vx * (vy + sqrt(pow(vy, 2) + 2 * gravity * height)) / gravity;
    }

    private static double actualAngle(double angle) {
        return (angle * 3.14159) / 180;
    }
}
