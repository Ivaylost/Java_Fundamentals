package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(String item:input){
            list.add(Integer.parseInt(item));
        }

        String command = scanner.nextLine();
        while (!(command.equals("end"))){
            String[] commands = command.split(" ");
            if (commands[0].equals("Insert")){
                int index = Integer.parseInt(commands[2]);
                int value = Integer.parseInt(commands[1]);
                list.add(index, value);

            } else if (commands[0].equals("Delete")){
                Integer element = Integer.parseInt(commands[1]);
                list.remove(element);
            }

            command = scanner.nextLine();
        }

        for(int item:list){
            System.out.print(item + " ");
        }
    }
}
