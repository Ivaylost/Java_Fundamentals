package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" -> ");
        Map<String, List<String>> companyUsers = new LinkedHashMap<>();

        while (!input[0].equals("End")){
            String name = input[0];
            String id = input[1];
            companyUsers.putIfAbsent(name, new ArrayList<>());
            List<String> ids = companyUsers.get(name);
            if (!ids.contains(id)){
                ids.add(id);
            }
            input= sc.nextLine().split(" -> ");
        }

        for(Map.Entry<String, List<String>> set : companyUsers.entrySet()){
            System.out.println(set.getKey());
            set.getValue().forEach(x -> System.out.printf("-- %s%n", x));
        }
    }
}
