package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenNumbersStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = 0;

        for (int num: arr) {
            if(num%2 == 0){
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
