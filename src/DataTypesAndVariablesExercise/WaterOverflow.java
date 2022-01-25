package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n  = Integer.parseInt(scanner.nextLine());
        int input = 0;
        int capacity = 255;
        int liters = 0;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(scanner.nextLine());
            if (liters+input <= capacity){
                liters += input;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(liters);
    }
}
