import java.util.Random;
import java.util.Scanner;

public class funGambling {
    protected Scanner scanner = new Scanner(System.in);
    protected Random random = new Random();
    protected int currentPoints = 10;
    protected boolean isStillPlaying = true;

    public void playGame(){
        printWelcome();
        printCurrentPoints();
        askUserToContinue();
        while (isStillPlaying){
            printTryToDouble();

            if(shouldDouble()){
                if(randomDouble()){
                    doubleCurrentPoints();
                    printCongrats();
                    printCurrentPoints();
                    askUserToContinue();
                }else{
                    printLost();
                    break;
                }
            }else {
                break;
            }
        }
        scanner.close();
        printWalkAwayMessage();
    }

    public void printWelcome(){
        System.out.println("*******WELCOME TO FUN GAMBLING*******");
        System.out.println("-------------------------------------");
    }
    public void askUserToContinue(){
        System.out.println("Do you wanna continue?(yes/no)");
        //equalsIgnoreCase is used to compare strings by ignoring case sensitivity
        isStillPlaying = scanner.nextLine().equalsIgnoreCase("yes");
    }
    public void printCurrentPoints(){
        System.out.println("You have "+currentPoints+" points now.");
    }
    public void printTryToDouble(){
        System.out.println("Do you wanna try to double?(yes/no):");
    }
    public boolean shouldDouble(){
        //equalsIgnoreCase is used to compare strings by ignoring case sensitivity
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
    public boolean randomDouble(){
        return random.nextBoolean();
    }
    public void doubleCurrentPoints(){
        currentPoints = currentPoints*2;
    }
    public void printCongrats(){
        System.out.println("Congrats! you points doubled.");
    }
    public void printLost(){
        System.out.println("Oops! you lost all your points.");
    }
    public void printWalkAwayMessage(){
        System.out.println("---------------------------");
        System.out.println("*******FUN GAMBLING*******");
        System.out.println("        Game ended");
        System.out.println("---------------------------");
    }
}
