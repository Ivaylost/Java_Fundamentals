package TextProcessing;

import java.util.Locale;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(", ");

        for(String user : data){
            boolean isValid = false;
            if(user.length() >= 3 && user.length() <= 16){
                for (int i = 0; i < user.length(); i++) {
                    char symbol = user.toLowerCase().charAt(i);
                    if (!((symbol >= 97 && symbol <= 122) || symbol == 45 || symbol == 95)){
                        isValid = false;
                        break;
                    }
                    isValid = true;
                }
            }
            if (isValid){
                System.out.println(user);
            }
        }
    }
}
