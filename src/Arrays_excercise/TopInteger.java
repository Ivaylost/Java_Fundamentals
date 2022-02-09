package Arrays_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(x -> Integer.parseInt(x)).toArray();
            String result = "";
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            boolean check = true;
            for (int j = i+1; j < input.length; j++) {
                if (input[i] <= input[j]){
                    check = false;
                }
            }
            if (check){
                result = result + " " + num;
            }
        }
        System.out.println(result);
    }
}
