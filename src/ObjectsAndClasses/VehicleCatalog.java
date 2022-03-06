package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalog {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input[0].equals("End"))
        {
            vehicles.add(new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3])));
            input = sc.nextLine().split(" ");
        }

        String line = sc.nextLine();
        while (!line.equals("Close the Catalogue"))
        {
            String model = line;
            vehicles.stream().filter(x->x.getModel().equals(model))
                    .forEach(System.out::println);

            line = sc.nextLine();
        }

        List<Vehicle> cars = vehicles.stream()
                .filter(x->x.getType().equals("car"))
                .collect(Collectors.toList());
        List<Vehicle> trucks = vehicles.stream()
                .filter(x->x.getType().equals("truck"))
                .collect(Collectors.toList());

        Double avgCarsHP = cars.stream().mapToDouble(Vehicle::getHorsePower)
                .sum() / cars.size();

        Double avgTrucksHP = trucks.stream().mapToDouble(Vehicle::getHorsePower)
                .sum() / trucks.size();

        if (trucks.size() == 0){
            avgTrucksHP = 0.0;
        }
        if (cars.size() == 0){
            avgCarsHP = 0.0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", avgCarsHP);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", avgTrucksHP);

    }

    static class Vehicle
    {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d",
                    Character.toUpperCase(this.getType().charAt(0)) + this.getType().substring(1), this.getModel(), this.getColor(), this.getHorsePower());
        }
    }
}
