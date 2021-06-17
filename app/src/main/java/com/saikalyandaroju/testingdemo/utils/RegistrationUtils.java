package com.saikalyandaroju.testingdemo.utils;

import android.util.Patterns;

import java.util.regex.Pattern;

public class RegistrationUtils {
    private static final Pattern EMAIL_ADDRESS = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    public static boolean validateUser(String email, String userName, String password, String confirmPassword) {
        if (email == null || userName == null || password == null || confirmPassword == null) {
            return false;
        }

        if (email.isEmpty() || userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false;
        }
        if (!EMAIL_ADDRESS.matcher(email).matches()) {
            return false;
        }
        if (password.length() < 6) {

            return false;
        }

        if (!password.equals(confirmPassword)) {
            return false;
        }

        return true;
    }

}
