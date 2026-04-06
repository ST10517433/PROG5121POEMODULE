import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();

        Login login = new Login(fName, lName);

        // --- Registration ---
        System.out.println("\n=== Register ===");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter cell number (+27...): ");
        String cell = sc.nextLine();

        System.out.println(login.registerUser(username, password, cell));

        // --- Login ---
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String loginUser = sc.nextLine();
        System.out.print("Enter password: ");
        String loginPass = sc.nextLine();

        System.out.println(login.returnLoginStatus(loginUser, loginPass));

        sc.close();
    }
}