package Arrays_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] fields = new int[num];
        int[] positions = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        for (int item:positions ) {
            if (item < fields.length){
                fields[item]=1;
            }
        }
        String command = sc.nextLine();
        while (!command.equals("end")){
            String[] commands = command.split(" ");
            int index = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if(direction.equals("right")){

            } else {

            }


            command = sc.nextLine();
        }
    }
}
