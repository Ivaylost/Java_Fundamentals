package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> race = new LinkedHashMap<>();
        String[] participant = scanner.nextLine().split(", ");

        for(String item:participant){
            race.putIfAbsent(item, 0);
        }

        String regexChars = "(?<char>[A-Za-z])";
        String regexNum = "(?<digit>[\\d])";
        Pattern patternChars = Pattern.compile(regexChars);
        Pattern patternNum = Pattern.compile(regexNum);

        String input = scanner.nextLine();

        while (!input.equals("end of race")){
            Matcher matcherChars = patternChars.matcher(input);
            Matcher matcherNum = patternNum.matcher(input);

            int sum = 0;
            while (matcherNum.find()){
                sum += Integer.parseInt(matcherNum.group("digit"));
            }

            StringBuilder name = new StringBuilder();
            while (matcherChars.find()){
                name.append(matcherChars.group("char"));
            }


            if(race.containsKey(name.toString())){
                int km = race.get(name.toString());
                race.put(name.toString(), km+sum);
            }


            input = scanner.nextLine();;
        }

        List<String> sorted = race.entrySet().stream()
                .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(s -> s.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s%n", sorted.get(0));
        System.out.printf("2nd place: %s%n", sorted.get(1));
        System.out.printf("3rd place: %s%n", sorted.get(2));
    }
}
