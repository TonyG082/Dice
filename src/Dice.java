import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of the number of sides of the dice");
        int side = scanner.nextInt();
        System.out.println("Think of the number from 1 to " +side);
        int num = scanner.nextInt();
            //Checking if the number
            if (scanner.hasNextInt()) {
                while (num <= 0 || num >= side) {
                    System.out.println("The number must be between 1 and " + side);
                    num = scanner.nextInt();
                }
            }
            else {System.out.println("You need to enter a number, You damn ass");}
        //End check
        scanner.close();

        Random random = new Random();
        int result = 0;
        int count = 0;
            while (result != num) {
                result = random.nextInt(side) + 1;
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