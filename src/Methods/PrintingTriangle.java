package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            printLineBig(i);
        }

        for (int i = input; i >= 0 ; i--) {
            printLineSmall(i);
        }
    }

    private static void printLineSmall(int i) {
        for (int j = 1; j <= i-1; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    private static void printLineBig(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
