package com.mycompany.prog5121_poe;

public class Login {
    private String registeredUsername;
    private String registeredPassword;
    
    // Check username: must contain "_" and be <= 5 chars
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    // Check password: 8+ chars, capital, number, special char
    public boolean checkPasswordComplexity(String password) {
        boolean hasCapital = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()].*");
        return password.length() >= 8 && hasCapital && hasNumber && hasSpecial;
    }
    
    // Register user
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        this.registeredUsername = username;
        this.registeredPassword = password;
        return "User registered successfully.";
    }
    
    // Login user
    public boolean loginUser(String username, String password) {
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }
    
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + username + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
