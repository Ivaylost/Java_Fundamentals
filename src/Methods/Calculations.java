package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int result = 0;

        switch (command) {
            case "add":
                result = addNums(num1, num2);
                break;
            case "subtract":
                result = subtractNums(num1, num2);
                break;
            case "multiply":
                result = multiplyNums(num1, num2);
                break;
            case "divide":
                result = divideNums(num1, num2);
                break;
        }

        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println(result);
    }

    private static int divideNums(int num1, int num2) {
        return num1/num2;
    }

    private static int multiplyNums(int num1, int num2) {
        return  num1*num2;
    }

    private static int subtractNums(int num1, int num2) {
        return num1 - num2;
    }

    private static int addNums(int num1, int num2) {
        return num1 + num2;
    }
}
