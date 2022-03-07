package AssociativeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Car car = cars.stream()
                    .filter(x -> x.getUserName().equals(input[1]))
                    .findFirst().orElse(null);

            if (input[0].equals("register")){
                if (car == null){
                    Car item = new Car(input[1], input[2]);
                    cars.add(item);
                    System.out.println(item.successMessage());
                } else if (!car.isRegistered()){
                    car.register();
                } else {
                    System.out.println(car.errorMessage());
                }
            }

            if (input[0].equals("unregister")){
                if (car == null){
                    System.out.printf("ERROR: user %s not found%n", input[1]);
                } else {
                    car.unRegister();
                    System.out.println(car.unregisterMessage());
                }
            }
        }
        cars.stream()
                .filter(x -> x.isRegistered())
                .forEach(x -> System.out.println(x));
    }

    public static class Car
    {
        String userName;
        String licensePlateNumber;
        boolean isRegistered;

        public Car(String userName, String licensePlateNumber) {
            this.userName = userName;
            this.licensePlateNumber = licensePlateNumber;
            this.isRegistered = true;
        }

        public String getUserName() {
            return userName;
        }

        public boolean isRegistered(){
            return this.isRegistered;
        }

        public void register(){
            this.isRegistered = true;
        }

        public void unRegister(){
            this.isRegistered = false;
        }

        public String errorMessage(){
            return String.format("ERROR: already registered with plate number %s", this.licensePlateNumber);
        }

        public String successMessage(){
            return String.format("%s registered %s successfully", this.userName, this.licensePlateNumber);
        }

        public String unregisterMessage(){
            return String.format("%s unregistered successfully", this.userName);
        }

        @Override
        public String toString() {
            return this.userName + " => " + this.licensePlateNumber;
        }
    }
}
