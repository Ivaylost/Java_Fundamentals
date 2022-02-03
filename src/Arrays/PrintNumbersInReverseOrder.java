package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] nums = new String[num];

        for (int i = num-1; i >= 0 ; i--) {
            String value = scanner.nextLine();
            nums[i] = value;
        }
        String expression = String.join(" ", nums);
        System.out.println(expression);
    }
}
