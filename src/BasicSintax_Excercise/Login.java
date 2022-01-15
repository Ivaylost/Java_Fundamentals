package BasicSintax_Excercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = reverse(scanner.nextLine());
        int counter = 1;

        while (true){
            String input = scanner.nextLine();
            if (input.equals(password)){
                System.out.printf("User %s logged in.", reverse(password));
                break;
            } else {
                if (counter == 4){
                    System.out.printf("User %s blocked!", reverse(password));
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }
    }

    public static String reverse(String str){
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}
