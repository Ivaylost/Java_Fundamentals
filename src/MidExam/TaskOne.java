package MidExam;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  days  = Integer.parseInt(scanner.nextLine());
        int  players  = Integer.parseInt(scanner.nextLine());
        double energyOfGroup = Double.parseDouble(scanner.nextLine());
        double waterPerDayPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayPerPerson = Double.parseDouble(scanner.nextLine());

        double totalWater = days*players*waterPerDayPerPerson;
        double totalFood = days*players*foodPerDayPerPerson;
        double energyLost = 0.0;
        boolean check = true;

        for (int i = 1; i <= days; i++) {
            energyLost = Double.parseDouble(scanner.nextLine());
            if (energyOfGroup - energyLost <= 0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood,totalWater);
                check = false;
                break;
            }
            energyOfGroup -= energyLost;
            if(i%2 == 0) {
                energyOfGroup = energyOfGroup * 1.05;
                totalWater = totalWater - totalWater * 0.3;
            }
            if (i%3 == 0){
                energyOfGroup = energyOfGroup * 1.10;
                totalFood = totalFood - totalFood/players;
            }
        }
        if (check) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energyOfGroup);
        }
    }
}
