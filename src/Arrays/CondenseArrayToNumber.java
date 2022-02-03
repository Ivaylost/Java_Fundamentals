package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (input.split(" ").length > 1) {
            input = condenseArray(input);
        }

        System.out.println(input);
    }

    private static String condenseArray(String input) {
        String result = "";
        int[] array = Arrays.stream(input.split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        for(int i=0 ; i < array.length-1; i++){
            result = result + (array[i] + array[i+1]) + " ";
        }


        return result;
    }
}
