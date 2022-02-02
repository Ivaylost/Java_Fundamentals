package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sumOdd = 0;
        int sumEven = 0;
        for(int num : array){
            if(num%2 == 0){
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
