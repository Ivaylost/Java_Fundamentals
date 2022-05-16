package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[>]{2}(?<product>\\w+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new LinkedList<>();
        double total = 0.0;

        String input = scanner.nextLine();

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String product = matcher.group("product");
                Double price = Double.parseDouble(matcher.group("price"));
                Double quantity = Double.parseDouble(matcher.group("quantity"));
                total = total + price*quantity;
                furniture.add(product);
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for(String item:furniture){
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", total);
    }
}
