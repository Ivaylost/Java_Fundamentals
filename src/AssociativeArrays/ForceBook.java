package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> forceSides = new LinkedHashMap<>();
        String input = sc.nextLine();

        while (!input.equals("Lumpawaroo")){
            String[] commands;
            if(input.contains(" | ")){
                commands = input.split(" \\| ");
                forceSides.putIfAbsent(commands[0], new ArrayList<>());
                List<String> item = forceSides.get(commands[0]);
                if (!item.contains(commands[1])) {
                    item.add(commands[1]);
                }
            } else {
                commands = input.split(" -> ");
                for(Map.Entry<String, List<String>> set : forceSides.entrySet()){
                    set.getValue().remove(commands[0]);
                }
                forceSides.putIfAbsent(commands[1], new ArrayList<>());
                List<String> item = forceSides.get(commands[1]);
                item.add(commands[0]);
                System.out.printf("%s joins the %s side!%n", commands[0], commands[1]);
            }


            input = sc.nextLine();
        }

        for(Map.Entry<String, List<String>> set : forceSides.entrySet()){
            if (set.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", set.getKey(), set.getValue().size());
                set.getValue().forEach(x -> System.out.printf("! %s%n", x));
            }
        }
    }
}
