package BasicSintax_Excercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  num  = Integer.parseInt(scanner.nextLine());
        int result = num;
        int sum = 0;

        while (result != 0){
            sum += getFact(result%10);
            result /= 10;
        }

        if (sum == num){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static int getFact(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
