package BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        do{
            if (num % 2 != 0) {
                System.out.println("Please write an even number.");
                num = Math.abs(Integer.parseInt(scanner.nextLine()));
            } else break;

        } while (num%2 != 0);

        System.out.printf("The number is: %d%n", num);

    }
}
