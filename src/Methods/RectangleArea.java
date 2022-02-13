package Methods;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        System.out.println(getRectangleArea(width, high));
    }

    private static int getRectangleArea(int width, int high) {
        return width*high;
    }
}
