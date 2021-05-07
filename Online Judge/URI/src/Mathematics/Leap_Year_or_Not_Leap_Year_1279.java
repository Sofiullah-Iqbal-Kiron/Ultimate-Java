// Accepted
// Presentation error debug from: https://replit.com/@rafaelrodrigues/URI-1279-Leap-Year-or-Not-Leap-Year-and


package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class Leap_Year_or_Not_Leap_Year_1279 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int newLine = 0;
        while (input.hasNext()) {
            String year = input.next().trim();
            if (newLine == 0) newLine = 1;
            else System.out.println("");
            boolean nothing = true;
            if (leapYear(year)) {
                System.out.println("This is leap year.");
                nothing = false;
            }
            if (hulukulu(year)) {
                System.out.println("This is huluculu festival year.");
                nothing = false;
            }
            if (leapYear(year) && bulukulu(year)) {
                System.out.println("This is bulukulu festival year.");
                nothing = false;
            }
            if (nothing) System.out.println("This is an ordinary year.");
        }
    }

    private static boolean leapYear(String year) {
        BigInteger theYear = new BigInteger(year);
        return theYear.mod(new BigInteger("400")).equals(new BigInteger("0")) || (!(theYear.mod(new BigInteger("100")).equals(new BigInteger("0"))) && (theYear.mod(new BigInteger("4")).equals(new BigInteger("0"))));
    }
    private static boolean hulukulu(String year) {
        BigInteger theYear = new BigInteger(year);
        return theYear.mod(new BigInteger("15")).equals(new BigInteger("0"));
    }
    private static boolean bulukulu(String year) {
        BigInteger theYear = new BigInteger(year);
        return theYear.mod(new BigInteger("55")).equals(new BigInteger("0"));
    }

//    private static boolean leapYear(String year) {
//        return divisibleBy400(year) || (!divisibleBy100(year) && divisibleBy4(year));
//    }
//
//    private static boolean hulukulu(String year) {
//        return divisibleBy15(year);
//    }
//
//    private static boolean bulukulu(String year) {
//        return divisibleBy55(year);
//    }
//
//    private static long digitSum(String number) {
//        long digitSum = 0;
//        for (int i = 0; i < number.length(); i++) digitSum += number.charAt(i) - '0';
//
//        return digitSum;
//    }
//    private static long alternateDigitSum(String number) {
//        long as = 0;
//        int i = 0;
//        if (number.charAt(0) == '-' || number.charAt(0) == '+') i = 1;
//        while (i < number.length()) {
//            as += number.charAt(i++) - '0';
//            if (i < number.length()) as -= number.charAt(i++) - '0';
//        }
//
//        return as;
//    }
//    private static boolean divisibleBy3(String number) {
//        return digitSum(number) % 3 == 0;
//    }
//    private static boolean divisibleBy4(String number) {
//        int newNumber = 0, numLen = number.length();
//        newNumber = newNumber * 10 + number.charAt(numLen - 2) - '0';
//        newNumber = newNumber * 10 + number.charAt(numLen - 1) - '0';
//
//        return newNumber % 4 == 0;
//    }
//    private static boolean divisibleBy5(String number) {
//        return number.length() > 0 && (number.charAt(number.length() - 1) == '0' || number.charAt(number.length() -
//        1) == '5');
//    }
//    private static boolean divisibleBy11(String number) {
//        return alternateDigitSum(number) % 11 == 0;
//    }
//    private static boolean divisibleBy15(String number) {
//        return divisibleBy3(number) && divisibleBy5(number);
//    }
//    private static boolean divisibleBy55(String number) {
//        return divisibleBy5(number) && divisibleBy11(number);
//    }
//    private static boolean divisibleBy100(String number) {
//
//    }
//    private static boolean divisibleBy400(String number) {
//
//    }
}
