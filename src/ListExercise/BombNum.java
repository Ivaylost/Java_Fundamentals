package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums   = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::length).collect(Collectors.toList());
        String[] bombs = scanner.nextLine().split(" ");
        Integer bomb = Integer.parseInt(bombs[0]);
        int power = Integer.parseInt(bombs[1]);

        for (int i = 0; i < power; i++) {
                if (bomb < nums.size()){
                    int index = nums.indexOf(bomb);
                }
        }
    }
}
