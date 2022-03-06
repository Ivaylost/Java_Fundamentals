package AssociativeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Orders {

    static class Product{
        String name;
        Double price;
        int quantity;

        public Product(String name, Double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName(){
            return this.name;
        }

        public void alreadyExist(Double price, int quantity){
            this.price = price;
            this.quantity = this.quantity + quantity;
        }

        @Override
        public String toString() {
            return String.format("%s -> %.2f", this.name, this.quantity*this.price);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("buy")){
            String name = input[0];
            Product product = products.stream()
                    .filter(x -> x.getName().equals(name)).findFirst().orElse(null);
            if (product == null){
                products.add(new Product(input[0], Double.parseDouble(input[1]), Integer.parseInt(input[2])));
            } else {
                product.alreadyExist(Double.parseDouble(input[1]), Integer.parseInt(input[2]));
            }
            input = scanner.nextLine().split("\\s+");
        }

        products.forEach(System.out::println);
    }
}
