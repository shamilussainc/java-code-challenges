import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int userInput = scanner.nextInt();
            System.out.println("Is the number even? "+ isEven(userInput));
        }catch (Exception e){
            System.out.println("!!!!!!!Please enter an integer value!!!!!!!!");
        }
    }

    public static boolean isEven(int userInput){
        return userInput % 2 == 0;
    }
}
