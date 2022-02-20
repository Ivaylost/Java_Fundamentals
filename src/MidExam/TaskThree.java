package MidExam;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<String> coffeeNames = new ArrayList<>();
        coffeeNames.addAll(Arrays.asList(input));
        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("Include")){
                coffeeNames.add(command[1]);
            }

            if (command[0].equals("Remove")){
                int num = Integer.parseInt(command[2]);
                if(command[1].equals("first") && coffeeNames.size() >= num && num > 0){
                    for (int j = 0; j < num; j++) {
                        coffeeNames.remove(0);
                    }
                }
                if(command[1].equals("last") && coffeeNames.size() >= num && num > 0){
                    for (int j = 0; j < num; j++) {
                        coffeeNames.remove(coffeeNames.size() - 1);
                    }
                }
            }

            if (command[0].equals("Prefer")){
                int firstIndex = Integer.parseInt(command[1]);
                int secondIndex = Integer.parseInt(command[2]);
                if (firstIndex >= 0 && secondIndex >=0 && firstIndex < coffeeNames.size() && secondIndex < coffeeNames.size()){
                    String check = "";
                    check = coffeeNames.get(firstIndex);
                    coffeeNames.set(firstIndex, coffeeNames.get(secondIndex));
                    coffeeNames.set(secondIndex, check);
                }
            }

            if (command[0].equals("Reverse")){
                Collections.reverse(coffeeNames);
            }
        }

        System.out.println("Coffees:");
        for (int i = 0; i < coffeeNames.size(); i++) {
            System.out.print(coffeeNames.get(i));
            if (i != coffeeNames.size()-1){
                System.out.print(" ");
            }
        }
    }
}
