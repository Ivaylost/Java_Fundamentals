package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int age = Integer.parseInt(command[1]);
            students.add(new Student(age, command[0]));
        }

        students.stream()
                .sorted((x,y) -> x.name.compareTo(y.name))
                .filter(x -> x.age > 30)
                .forEach(x -> System.out.println(x));
    }

    static class Student
    {
        int age;
        String name;

        Student(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.age;
        }
    }
}
