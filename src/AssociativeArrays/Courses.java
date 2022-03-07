package AssociativeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" : ");
        List<Course> courses = new ArrayList<>();

        while (!input[0].equals("end")){
            String courseName = input[0];
            String studentName = input[1];
            Course course = courses.stream()
                    .filter(x -> x.getName().equals(courseName))
                    .findFirst()
                    .orElse(null);
            if (course == null){
                Course item = new Course(courseName);
                item.getStudents().add(studentName);
                courses.add(item);
            } else {
                course.getStudents().add(studentName);
            }

            input = scanner.nextLine().split(" : ");
        }
        courses.forEach(x -> System.out.println(x));
    }

    public static class Course
    {
        String name;
        List<String> students;

        public String getName() {
            return name;
        }

        public List<String> getStudents() {
            return students;
        }

        public Course(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        @Override
        public String toString() {
            String output = this.name + ": " +students.size();
            for(String item : this.students){
                output += "\n-- " + item;
            }
            return output;
        }
    }
}
