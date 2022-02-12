package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());

        String result = getGrade(input);
        System.out.println(result);
    }

    private static String getGrade(double input) {
        if (input >= 2 && input <= 2.99){
            return "Fail";
        } else if (input >= 3 && input <= 3.49){
            return "Poor";
        } else if (input >= 3.50 && input <= 4.49){
            return "Good";
        } else if (input >= 4.50 && input <= 5.49){
            return "Very good";
        } else {
            return "Excellent";
        }
    }
}
