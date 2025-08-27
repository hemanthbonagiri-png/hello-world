import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int year = 2022;

        // keep asking in a loop until user types quit
        while (true) {
            String result = getInputFromScanner(year);
            if (result.equals("QUIT")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println(result);
            System.out.println(); // spacing for readability
        }
    }

    public static String getInputFromScanner(int year) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, whats your name? (type 'quit' to exit)");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("quit")) {
            return "QUIT"; // special signal to stop the loop
        }

        System.out.println("what year you were born?");
        String dateOfBirth = scanner.nextLine();

        int age = year - Integer.parseInt(dateOfBirth);
        return "so you are " + age + " years old, " + name;
    }
}
