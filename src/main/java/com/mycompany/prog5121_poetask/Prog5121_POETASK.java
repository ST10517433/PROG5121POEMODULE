// Author: Jabulani Kristen Mfeka - ST10517433
// PROG5121 POE Part 1
package com.mycompany.prog5121_poetask;

import java.util.Scanner;

public class Prog5121_POETASK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        Login login = new Login(firstName, lastName);

        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        System.out.print("Enter cell number (+27...): ");
        String cell = input.nextLine();

        String regMessage = login.registerUser(username, password, cell);
        System.out.println(regMessage);

        if (regMessage.contains("Cell number successfully captured.")) {
            System.out.println("\n--- Login ---");
            System.out.print("Enter username: ");
            String loginUser = input.nextLine();
            System.out.print("Enter password: ");
            String loginPass = input.nextLine();
            System.out.println(login.returnLoginStatus(loginUser, loginPass));
        }
        input.close();
    }
}