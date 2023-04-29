import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        // Pre-defined credentials
        String validUsername = "myusername";
        String validPassword = "mypassword";
        
        // Prompt user for credentials
        System.out.print("Enter your username: ");
        username = scanner.next();
        System.out.print("Enter your password: ");
        password = scanner.next();
        
        // Check credentials
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password.");
        }
        
        scanner.close();
    }
}