package DataTypesAndVariablesExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  yield  = Integer.parseInt(scanner.nextLine());
        BigInteger sum = new BigInteger("0");
        int counter = 0;
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("0");

        while (yield >= 100){
            A = BigInteger.valueOf(yield - 26);
            sum = sum.add(A);
            yield -= 10;
            counter++;
        }
        A = BigInteger.valueOf(0);
        B = BigInteger.valueOf(26);
        System.out.println(counter);

        if ((sum.subtract(B)).compareTo(A)) > -1){
            System.out.println(0);
        } else {
            System.out.println(sum.subtract(B));
        }
    }
}
