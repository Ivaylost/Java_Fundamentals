package Arrays_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input.length; j++) {
                if ((input[i] + input[j]) == num){
                    System.out.println(input[i] + " " + input[j]);
                }
            }
        }
    }
}
