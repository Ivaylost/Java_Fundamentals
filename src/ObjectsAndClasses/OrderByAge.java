package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        List<Person> people = new ArrayList<>();

        while (!line[0].equals("End")){
            people.add(new Person(line[0], line[1], Integer.parseInt(line[2])));
            line = sc.nextLine().split(" ");
        }

        people.stream().sorted((x, y) -> Double.compare(x.getAge(), y.getAge()))
                .forEach(x-> System.out.println(x));
    }

    static class Person
    {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
