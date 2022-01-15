package BasicSyntax;

import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int num = 0;

        if ((min+30) > 60){
            min = min + 30 -60;
            num = 1;
        } else {
            min += 30;
        }
        String prnt ="";
        if (num == 1){
            hour += num;
        }
        if (min<10){
            prnt = "0" + min;
        } else {
            prnt = "" + min;
        }

        if (hour > 23){
            hour = 0;
        }

        System.out.printf("%d:%s", hour, prnt);
    }
}
