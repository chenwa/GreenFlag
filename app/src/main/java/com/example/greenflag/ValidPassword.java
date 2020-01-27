// Author: Warren Chen 01/26/20
// Class used to check if the password is valid
// Minimum of 8 characters and contain at least one number, one uppercase, and one
// lower case letter. You an use special characters.

package com.example.greenflag;

import java.lang.String;
import java.lang.Character;

public class ValidPassword {

    public static boolean isValid(String password) {
        //return true if and only if password:

        //1. has at least eight characters.
        if (password.length() < 8) {
            return false;
        }

        //2. contains at least one number.
        boolean hasNumber = false;

        //3. contains at least one uppercase.
        boolean hasUpper = false;

        //4. contains at least one lowercase.
        boolean hasLower = false;

        char c;

        for (int i = 0; i < password.length() - 1; i++) {
            c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasNumber = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }

            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }

        return (hasNumber && hasUpper && hasLower);
    }
}
