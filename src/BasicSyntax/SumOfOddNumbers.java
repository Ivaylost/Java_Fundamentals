package BasicSyntax;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int iterator = 1;


        for (int i = 0; i < num; i++) {
            System.out.println(iterator);
            sum += iterator;
            iterator += 2;
        }

        System.out.println("Sum: "+ sum);
    }
}
