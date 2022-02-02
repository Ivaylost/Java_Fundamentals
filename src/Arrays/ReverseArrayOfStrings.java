package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String x = "";
        for (int i = 0; i < array.length/2; i++) {
            x = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = x;
        }

        System.out.println(String.join(" ", array));
    }
}
