package Arrays_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(x->Integer.parseInt(x)).toArray();
            int sumLeft = 0;
            int sumRight = 0;
            boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight){
                System.out.println(i);
                check = false;
            }
            sumLeft = sumRight = 0;
        }
        if (check){
            System.out.println("no");
        }
    }
}
