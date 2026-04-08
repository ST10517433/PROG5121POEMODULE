// Author: Jabulani Kristen Mfeka - ST10517433
// PROG5121 POE Part 1
// Reference: Oracle Java Documentation - Pattern Class (2023)
package com.mycompany.prog5121_poetask;

public class Login {
    private String storedUsername;
    private String storedPassword;
    private String storedCellNumber;
    private String firstName;
    private String lastName;

    public Login(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        boolean hasLength = password.length() >= 8;
        boolean hasCapital = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?~`].*");
        return hasLength && hasCapital && hasNumber && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String cellNumber) {
        String regex = "^\\+27\\d{9}$";
        return cellNumber.matches(regex) && cellNumber.length() <= 12;
    }

    public String registerUser(String username, String password, String cellNumber) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }
        this.storedUsername = username;
        this.storedPassword = password;
        this.storedCellNumber = cellNumber;
        return "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
    }

    public boolean loginUser(String username, String password) {
        return username.equals(this.storedUsername) && password.equals(this.storedPassword);
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}