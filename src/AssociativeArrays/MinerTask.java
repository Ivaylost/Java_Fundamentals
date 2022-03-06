package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String, Integer> result = new LinkedHashMap<>();


        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            Integer quantities = result.get(resource);
            if (quantities != null){
                result.put(resource, quantities + quantity);
            } else {
                result.put(resource, quantity);
            }
            resource = scanner.nextLine();
        }

        for(Map.Entry<String, Integer> set : result.entrySet()){
            System.out.println(set.getKey() + " -> " + set.getValue());
        }
    }
}
