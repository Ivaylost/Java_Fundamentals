package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(" ");
            int maxCapacity = Integer.parseInt(scanner.nextLine());
            List<Integer> wagons = new ArrayList<>();
            for(String item: input){
                wagons.add(Integer.parseInt(item));
            }
            int counter = 0;
            String[] command = scanner.nextLine().split(" ");

            while (!command[0].equals("end")){
                if (command[0].equals("Add")){
                    wagons.add(Integer.parseInt(command[1]));
                } else {
                    int x = Integer.parseInt(command[0]);
                    for(int i = 0; i < wagons.size(); i++){
                        if(wagons.get(i) + x <= maxCapacity){
                            wagons.set(i,wagons.get(i) + x);
                            break;
                        }
                    }
                }
                command = scanner.nextLine().split(" ");
            }
        for(int item:wagons){
            System.out.print(item + " ");
        }
        }
    }

