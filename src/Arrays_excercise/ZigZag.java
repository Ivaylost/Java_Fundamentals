package Arrays_excercise;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  num  = Integer.parseInt(scanner.nextLine());
        String first = "";
        String second = "";
        int counterOne = 0;
        int counterTwo = 1;

        for (int i = 0; i < num; i++) {
            String[] inputOne = (scanner.nextLine()).split(" ");
            first += " " + inputOne[counterOne];
            second += " " + inputOne[counterTwo];
            if (counterOne == 0){
                counterOne = 1;
                counterTwo = 0;
            } else {
                counterOne = 0;
                counterTwo = 1;
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
