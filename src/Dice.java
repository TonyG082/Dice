import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        System.out.println("Think of the number from 1 to 6");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
            while (num <= 0 || num >= 7) {
                System.out.println("The number must be between 1 and 6");
                num = scanner.nextInt();
            }
        scanner.close();
        Random random = new Random();
        int result = random.nextInt(6) + 1;
        int count = 1;
            while (result != num) {
                result = random.nextInt(6) + 1;
                ++count;
            }
            System.out.println("The Dice has been roll " +count +" times");
            System.out.println("Dice shows: " + result);

        if (result % 2 == 0)
            System.out.println("The dice is pair");
        else
            System.out.println("The dice is unpair");

    }
}