package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(name, new ArrayList<>());
            List<Double> grades = students.get(name);
            grades.add(grade);
        }

        for(Map.Entry<String, List<Double>> set : students.entrySet()){

            double avrg = set.getValue().stream()
                            .mapToDouble(d -> d).average().orElse(0.0);
            if (avrg >= 4.50){
                System.out.printf("%s -> %.2f%n", set.getKey(), avrg);
            }
        }
    }
}
