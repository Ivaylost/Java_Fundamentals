package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n  = Integer.parseInt(scanner.nextLine());
        String biggestModel = "";
        double biggestVolume = 0;
        String model = "";
        double r = 0;
        int h = 0;
        double volume = 0;




        for (int i = 0; i < n; i++) {
            model = scanner.nextLine();;
            r = Double.parseDouble(scanner.nextLine());
            h = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * Math.pow(r, 2) * h;
            if (volume >= biggestVolume){
                biggestVolume = volume;
                biggestModel = model;
            }
        }

        System.out.println(biggestModel);
    }
}
