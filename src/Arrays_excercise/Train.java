package Arrays_excercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  wagons  = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String[] people = new String[wagons];

        for (int i = 0; i < wagons; i++) {
            people[i] = scanner.nextLine();
            sum += Integer.parseInt(people[i]);
        }

        String result = String.join(" ", people);
        System.out.println(result);
        System.out.println(sum);
    }
}
