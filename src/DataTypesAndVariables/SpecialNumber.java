package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  num  = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 1; i <= num ; i++) {
            check = getResult(i);
            if (check){
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }

    private static boolean getResult(int i) {
        int sum = getSum(i);
        return sum ==5 || sum == 7 || sum== 11;
    }

    private static int getSum(int i) {
        int sum = 0;
        while (i > 0){
            sum += i%10;
            i /= 10;
        }
        return sum;
    }
}
