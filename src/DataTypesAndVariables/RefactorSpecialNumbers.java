package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            String result = (isSpecialNum ? "True" : "False");
            System.out.printf("%d -> %s%n", i, result);
            sum = 0;
        }

    }
}
