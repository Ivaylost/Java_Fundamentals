package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "OIU - IUI:L UY B";
        String ou = input.substring(0, input.indexOf('-')-1);
        System.out.println(ou);
    }
}
