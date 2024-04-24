package task7;

import java.util.Scanner;

public class PasswordGenerator {
    private static final String SPECIAL_CHARACTERS = "@$*#";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password for your laptop: ");
        String password = scanner.nextLine();
        scanner.close();  // It's good practice to close the scanner when done

        if (isValidPassword(password)) {
            System.out.println("Password is valid and set for your laptop!");
        } else {
            System.out.println(password + " is an invalid password");
        }
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.length() > 12) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (SPECIAL_CHARACTERS.indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasSpecial;
    }
}
