package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        Map<Character, Integer> result = new LinkedHashMap<>();

        for(char ch : input){
            if(ch != ' '){
                Integer value = result.get(ch);
                if (value != null){
                    result.put(ch, ++value);
                } else {
                    result.put(ch, 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> set : result.entrySet()){
            System.out.println(set.getKey() + " -> " + set.getValue());
        }
    }
}
