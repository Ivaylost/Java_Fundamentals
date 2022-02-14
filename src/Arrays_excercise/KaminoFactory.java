package Arrays_excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        String command = scanner.nextLine();
        int minIndex = arr.length;
        String result = "";
        int maxSum = 0;
        int sum = 0;
        int counter = 0;
        int counter1 = 0;
        int bestSequenceIndex = 0;

        while (!command.equals("Clone them!")){
            counter++;
            arr = Arrays.stream(command.split("[!!]"))
                    .mapToInt(x -> Integer.parseInt(x)).toArray();

            int[] index = getFirstIndex(arr);
            if (index[0]<minIndex && maxSum <= index[1]){
                minIndex = index[0];
                maxSum = index[1];
                sum = getSum(arr);
                result = "";
                for (int item : arr) {
                    result += " "+item;
                }
                counter1 = counter;
            } else if(index[0]==minIndex && sum < getSum(arr)){
                maxSum = index[1];
                sum = getSum(arr);
                result = "";
                for (int item : arr) {
                    result += " "+item;
                }
                counter1 = counter;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", counter1, sum);
        System.out.println(result);
    }

    private static int[] getFirstIndex(int[] arr) {
        int minIndex = 0;
        int maxCountCum = 0;
        int currentIndex = 0;
        int currCountSum = 0;
        boolean check = true;
        int[] data = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                if(check){
                    currentIndex = i;
                }
                check = false;
                currCountSum++;
                if (currCountSum > maxCountCum){
                    maxCountCum = currCountSum;
                    if (i < arr.length-1 && arr[i+1] == 0){
                        minIndex = currentIndex;
                    }
                }
            } else {
                check = true;
                currCountSum = 0;
            }
        }
        data[0] = minIndex;
        data[1] = maxCountCum;
        return data;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int index : arr){
            sum += index;
        }
        return sum;
    }
}
