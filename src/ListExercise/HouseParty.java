package ListExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<String> lst = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (!lst.contains(input[0]) && !input[2].equals("not")){
                lst.add(input[0]);
            } else if (lst.contains(input[0]) && !input[2].equals("not")){
                System.out.println(input[0] + " is already in the list!");
            }

            if (input[2].equals("not")){
                boolean remove = lst.remove(input[0]);
                if (!remove){
                    System.out.println(input[0] + " is not in the list!");
                }
            }
        }

        for(String item: lst){
            System.out.println(item);
        }
    }
}
