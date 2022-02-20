package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        List<String> phones = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("")){
                phones.add(input[i]);
            }
        }

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("End")){
            if(command[0].equals("Add")){
                if (!phones.contains(command[1])){
                    phones.add(command[1]);
                }
            }
            if(command[0].equals("Remove")){
                if(phones.contains(command[1])) {
                    phones.remove(command[1]);
                }
            }
            if(command[0].equals("Bonus phone")){
                String[] items = command[1].split(":");
                if(items.length == 2 && phones.contains(items[0])) {
                    if (phones.indexOf(items[0]) == phones.size() - 1) {
                        phones.add(items[1]);
                    } else {
                        int index = phones.indexOf(items[0]);
                        phones.set(index + 1, items[1]);
                    }
                }
            }
            if(command[0].equals("Last")){
                if (phones.contains(command[1])){
                    int index = phones.indexOf(command[1]);
                    String check = phones.get(index);
                    phones.remove(command[1]);
                    phones.add(check);
                }
            }

            command = scanner.nextLine().split(" - ");
        }
        boolean check = true;
        for (int i = 0; i < phones.size(); i++) {
            System.out.print(phones.get(i));
            if (i != phones.size()-1){
                System.out.print(", ");
            }
            check = false;
        }
        if (check){
            System.out.println("");
        }
    }
}
