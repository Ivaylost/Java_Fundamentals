package AssociativeArrays;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        boolean check = false;

        while (!check) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i = i + 2) {
                Integer value = Integer.parseInt(input[i]);
                items.putIfAbsent(input[i + 1].toLowerCase(), 0);
                Integer values = items.get(input[i + 1].toLowerCase());
                items.put(input[i + 1].toLowerCase(), values + value);

                if (input[i + 1].toLowerCase().equals("shards") && (value + values) >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", (value + values) - 250);
                    check = true;
                    break;
                } else if (input[i + 1].toLowerCase().equals("fragments") && (value + values) >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", (value + values) - 250);
                    check = true;
                    break;
                } else if (input[i + 1].toLowerCase().equals("motes") && (value + values) >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", (value + values) - 250);
                    check = true;
                    break;
                }
            }
        }

        for(Map.Entry<String, Integer> set : items.entrySet()){
            System.out.println(set.getKey() + ": " + set.getValue());
        }
    }
}
