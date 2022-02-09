package Arrays_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] first = (scanner.nextLine()).split(" ");
            String[] second = (scanner.nextLine()).split(" ");
            String result = "";

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (first[j].equals(second[i])){
                    result = result + " " + first[j];
                }
            }
        }
        System.out.println(result);
    }
}
