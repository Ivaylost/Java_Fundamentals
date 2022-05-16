package Exam;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        String input = scanner.nextLine();
        String[] inputs = input.split(" \\| ");
        for(String item : inputs){
            String[] def = item.split(":\\s+");
            if (def.length > 1)
            {
                dictionary.putIfAbsent(def[0], new ArrayList<>());
                List<String> lst = dictionary.get(def[0]);
                lst.add(def[1]);
            }
        }
        String[] words = scanner.nextLine().split("\\s+\\|\\s+");
        String command = scanner.nextLine();

        if(command.equals("Hand Over")){
            for(Map.Entry<String, List<String>> set : dictionary.entrySet()){
                System.out.print(set.getKey() + " ");
            }
        }

        if(command.equals("Test")){
            for (String word : words){
                List<String> lst = dictionary.get(word);
                if (lst != null){
                    System.out.println(word + ":");
                    for (String item : lst){
                        System.out.println(" -" + item);
                    }
                }
            }
        }
    }
}
