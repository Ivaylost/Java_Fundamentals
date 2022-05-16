package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([$|%])(?<name>[A-Z][a-z]{2,})\\1[:][\\s]+(([\\[])(?<digit>\\d+)(\\]\\|))(([\\[])(?<digit1>\\d+)(\\]\\|))(([\\[])(?<digit2>\\d+)(\\]\\|))$";
        int num = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println(matcher.group("name") + ": " + (char)Integer.parseInt(matcher.group("digit"))
                        + (char)Integer.parseInt(matcher.group("digit1")) + (char)Integer.parseInt(matcher.group("digit2")));
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
