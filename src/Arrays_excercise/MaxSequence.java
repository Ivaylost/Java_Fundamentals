package Arrays_excercise;

import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int currentSum = 1;
        String currentChar = input[0];
        int maxSum = 1;
        String maxChar = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(currentChar)){
                currentSum++;
            } else {
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    maxChar = currentChar;
                }
                currentSum = 1;
                currentChar = input[i];
            }
        }
        if (currentSum > maxSum){
            maxSum = currentSum;
            maxChar = currentChar;
        }
        for (int i = 0; i < maxSum; i++) {
            System.out.print(maxChar + " ");
        }
    }
}
