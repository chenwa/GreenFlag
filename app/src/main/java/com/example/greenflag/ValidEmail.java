// Java program to check if an email address
// is valid using Regex.

// Taken from:
// https://www.geeksforgeeks.org/check-email-address-valid-not-java/


package com.example.greenflag;

import java.util.regex.Pattern;

class ValidEmail {
    public static boolean isValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }
}
