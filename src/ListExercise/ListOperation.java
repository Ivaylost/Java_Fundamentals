package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String item : input) {
            integers.add(Integer.parseInt(item));
        }

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Add":
                    integers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(command[2]);
                    if(index1>=0 && index1<integers.size()) {
                        integers.add(index1, Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(command[1]);
                    if(index>=0 && index<integers.size()) {
                        integers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int times = Integer.parseInt(command[2]);
                    if (command[1].equals("left")) {
                        for (int i = 0; i < times; i++) {
                            int first = integers.get(0);
                            int x = 0;
                            integers.add(first);
                            integers.remove(x);
                        }
                    } else if(command[1].equals("right")){
                        for (int i = times-1; i >= 0; i--) {
                            int last = integers.get(integers.size()-1);
                            int x = integers.size();
                            integers.add(0, last);
                            integers.remove(x);
                        }
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for(int item:integers){
            System.out.print(item + " ");
        }
    }
}
