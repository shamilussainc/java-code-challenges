import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wanna play?(yes/no):");
        if (scanner.nextLine().toLowerCase().equals("yes")){
            int points = 10;
            System.out.println("Game started \n you have "+ points+" points now!");
            System.out.println("Do you dare to take a chance?(yes/no): ");
            if (scanner.nextLine().toLowerCase().equals("yes")){
                winByLuck(points);
            }
        }
        System.out.println("Game closed.");
    }
    public static void winByLuck(int points){
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();
        if(randomBoolean){
            points=points*2;
            System.out.println("congrats! your points doubled.");
        }
        else {
            points=0;
            System.out.println("Oops! you lost all your points.");
        }
        System.out.println("You have "+ points+" points now!");

    }
}
