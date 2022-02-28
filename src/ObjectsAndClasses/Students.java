package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            Double grade = Double.parseDouble(command[2]);
            students.add(new Student(command[0], command[1], grade));
        }

        students.stream()
                .sorted((x, y) -> Double.compare(y.grade, x.grade))
                .forEach(x -> System.out.println(x));
    }

    static class Student
    {
        String firstName;
        String lastName;
        Double grade;

        public Student(String firstName, String lastName, Double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
