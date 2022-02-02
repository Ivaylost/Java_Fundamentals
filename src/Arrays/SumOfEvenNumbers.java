package Arrays;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int sum = 0;

        for (String num: arr) {
            if(Integer.parseInt(num)%2 == 0){
                sum += Integer.parseInt(num);
            }
        }

        System.out.println(sum);
    }
}
