package BasicSintax_Excercise;

import java.util.Scanner;

public class Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount  = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        double sum = 0;


        double x = Math.ceil(1.10*students);
        double a = (lightsabers*x);
        double b = robes*students;
        double c = (belts*(students-students/6));

        sum = a+b+c;

        if (sum <= amount){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - amount);
        }

    }
}
