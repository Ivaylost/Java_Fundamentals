package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  input  = Integer.parseInt(scanner.nextLine());
        for (int j = 97; j <  97 + input ; j++) {
            for (int k = 97; k < 97+input; k++) {
                for (int l = 97; l < 97+input; l++) {
                    System.out.println(Character.toString((char) j) + Character.toString((char) k) + Character.toString((char) l));
                }
            }
        }
    }
}
