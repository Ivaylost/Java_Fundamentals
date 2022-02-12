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
            if (item >=0 && item < fields.length){
                fields[item]=1;
            }
        }
        String command = sc.nextLine();
        while (!command.equals("end")){
            String[] commands = command.split(" ");
            int index = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if((index < 0 || index >= fields.length) || fields[index] != 1) {
                command = sc.nextLine();
                continue;
            }


                    if (direction.equals("right")) {
                        if((index + length) <= fields.length){
                            int rightPosition = getNextRightPosition(index, length, fields);
                            if(rightPosition != -1){
                                fields[rightPosition] = 1;
                                fields[index] = 0;
                            } else {
                                fields[index] = 0;
                            }
                        } else {
                            fields[index] = 0;
                        }
                    } else {
                        if((index - length) >= 0){
                            int leftPosition = getNextLeftPosition(index, length, fields);
                            if(leftPosition != -1){
                                fields[leftPosition] = 1;
                                fields[index] = 0;
                            } else {
                                fields[index] = 0;
                            }
                        } else {
                            fields[index] = 0;
                        }
                    }


            command = sc.nextLine();
        }
        for (int item:fields) {
            System.out.print(item + " ");
        }
    }

    private static int getNextLeftPosition(int index, int length, int[] fields) {
        int position = 0;
        for (int i = index; i >= 0 ; i-=length) {
            if (fields[i] == 0){
                return i;
            }
        }
        return -1;
    }

    private static int getNextRightPosition(int index, int length, int[] fields) {
        int position = 0;
        for (int i = index; i < fields.length ; i+=length) {
            if (fields[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
