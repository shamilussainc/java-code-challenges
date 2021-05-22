import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Is the password strong enough? "+verifyPassword(password));
        verifyPassword(password);
    }

    public static boolean verifyPassword(String password){
        if(password.length()<6){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        for(char letter : password.toCharArray()){
            if(Character.isUpperCase(letter)){
                hasUpperCase = true;
            }
            if(Character.isLowerCase(letter)){
                hasLowerCase = true;
            }
            if(Character.isDigit(letter)){
                hasNumber = true;
            }
        }
        return hasUpperCase&&hasLowerCase&&hasNumber;
    }
}
