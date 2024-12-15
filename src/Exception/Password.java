package Exception;

public class Password {
    public static void main(String[] args) {
        String[] passwords = {"MyPassword123", "FFFFFF66", "ShlechtPass", "asDf3h", "avalanche gt2020"};

        passVerification(passwords);
    }

    public static void pasLength(String password) {
        if (password.length() < 8) {
            System.out.println(password + " Пароль должен быть не менее 8 символов");
        } else if (password.length() > 20) {
            System.out.println(password + " Пароль должен быть не более 20 символов");
        }
    }

    public static void hasUpperCase(String password) {
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            System.out.println("Пароль: " + password + " - должен содержать хотя бы одну заглавную букву");
        }
    }

    public static void hasLowerCase(String password) {
        boolean hasLowerCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            System.out.println("Пароль: " + password + " - должен содержать хотя бы одну строчную букву");
        }
    }

    public static void hasDigit(String password) {
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            System.out.println("Пароль: " + password + " - должен содержать цифры");
        }
    }

    public static void hasNoWhiteSpace(String password) {
        boolean hasWhiteSpace = true;
        for (char c : password.toCharArray()) {
            if (Character.isWhitespace(c)) {
                hasWhiteSpace = false;
                break;
            }
        }
        if (!hasWhiteSpace) {
            System.out.println("В пароле: " + password + " - не должно быть пробелов");
        }
    }

    public static void passVerification(String[] passwords) {
        for (String words : passwords) {
            pasLength(words);
            hasUpperCase(words);
            hasLowerCase(words);
            hasDigit(words);
            hasNoWhiteSpace(words);
        }
    }
}



