package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = 0;
        int index = 0;
        boolean isEqual = true;

        for (int i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] == arrayTwo[i]){
                sum += arrayOne[i];
            } else {
                index = i;
                isEqual = false;
                break;
            }
        }

        if (isEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
