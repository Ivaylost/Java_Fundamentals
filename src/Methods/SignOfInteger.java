package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String sign = getSign(num);

        System.out.printf("The number %d is %s.", num, sign);
    }

    private static String getSign(int num) {
        if (num > 0){
            return "positive";
        } else if(num < 0){
            return "negative";
        }
        return "zero";
    }
}
