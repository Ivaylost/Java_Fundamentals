package Exam;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] commands = command.split("\\s+");
            switch (commands[0]){
                case "Change":
                    input = input.replace(commands[1].charAt(0), commands[2].charAt(0));
                    System.out.println(input);
                    break;
                case "Includes":
                    if(input.contains(commands[1])){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if((input.substring(input.length()-commands[1].length(), input.length())).equals(commands[1])){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int ch = input.indexOf(commands[1].charAt(0));
                    System.out.println(ch);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int index1= Integer.parseInt(commands[2]);
                    input = input.substring(index, index + index1);
                    System.out.println(input);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
