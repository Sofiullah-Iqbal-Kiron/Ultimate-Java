// Accepted


package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialSum_1161 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (input.hasNext()) System.out.println(factSum(input.nextInt(), input.nextInt()));
    }

    private static BigInteger factSum(int x, int y) {
        BigInteger xFact = BigInteger.ONE, yFact = BigInteger.ONE;
        int i;
        for (i = 2; i <= x; i++) xFact = xFact.multiply(BigInteger.valueOf(i));
        for (i = 2; i <= y; i++) yFact = yFact.multiply(BigInteger.valueOf(i));

        return xFact.add(yFact);
    }
}
