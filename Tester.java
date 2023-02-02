import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Random a = new Random();
        int number = a.nextInt(1, 10);
        Scanner scan = new Scanner(System.in);

        boolean active = true;
        System.out.println("Welcome! Try to guess the num from 1 to 10! give it a try!");
        while (active) {
            System.out.println();
            int guess = scan.nextInt();
            System.out.println("oh u entered: " + guess + "... good luck!");
            if (number == guess) {
                System.out.println("Congratulations! the number was "+number+" gj!");
                active = false;
            } else {
                System.out.println("oh unlucky! try again!");
            }
        }
    }
}