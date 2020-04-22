import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput = "";

        System.out.println("Enter something: ");
        userInput = keyboard.nextLine();

        while (!userInput.equals("")) {
            System.out.println(userInput);
            System.out.println("Enter something: ");
            userInput = keyboard.nextLine();
        }
    }
}