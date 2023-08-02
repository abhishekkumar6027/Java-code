import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user with the customized message
        System.out.println("Hello " + name + ", have a good day!");
    }
}
