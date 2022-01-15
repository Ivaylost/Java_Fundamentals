package BasicSyntax;

public class DivisibleByThree {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= 100 ; i++) {
            if (i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
