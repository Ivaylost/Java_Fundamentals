package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ext = input.replace("\\", " " ).split(" ");

        String[] file = ext[ext.length-1].split("\\.");
        System.out.println("File name: " + file[0]);
        System.out.println("File extension: " + file[1]);
    }
}
