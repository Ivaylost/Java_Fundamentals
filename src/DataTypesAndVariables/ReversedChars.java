package DataTypesAndVariables;

import java.io.IOException;
import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char a = scanner.next().charAt(0);

        String s = String.valueOf(a)+" " + b + " " + c;
        System.out.println(s);
    }
}
