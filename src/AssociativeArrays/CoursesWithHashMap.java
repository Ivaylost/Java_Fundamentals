package AssociativeArrays;

import java.util.*;

public class CoursesWithHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" : ");
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input[0].equals("end")){
            String courseName = input[0];
            String studentName = input[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
            List<String> students = courses.get(courseName);
            students.add(studentName);
            input = scanner.nextLine().split(" : ");
        }
        for(Map.Entry<String, List<String>> set : courses.entrySet()){
            System.out.printf("%s: %d%n", set.getKey(), set.getValue().size());
            for(String item : set.getValue()){
                System.out.printf("-- %s%n", item);
            }
        }
    }
}
