package Arrays_excercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = (scanner.nextLine()).split(" ");
        int  input  = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            arr = rotate(arr);
        }

        System.out.println(String.join(" ", arr));
    }

    private static String[] rotate(String[] input) {
        String first = input[0];
        for (int i = 1; i < input.length; i++) {
            input[i-1] = input[i];
        }
        input[input.length-1] = first;
        return input;
    }
}
