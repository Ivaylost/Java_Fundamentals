package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());

        if(num1 > 10){
            System.out.printf("%d X %d = %d%n", num, num1, num*num1);
        } else {
            for (int i = num1; i <=10 ; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num*i);
            }
        }


    }
}
