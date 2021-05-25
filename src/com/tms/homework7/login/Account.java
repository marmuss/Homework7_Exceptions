package com.tms.homework7.login;

/**
 * Класс Account содерит метод checkSignUp для проверки логина и пароля.
 * В случае неверных данных выбрасывает исключения
 */

public class Account {

    public static boolean checkSignUp(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        boolean tmp = true;

        if (login.length() >= 20) {
            tmp = false;
            throw new WrongLoginException("Логин не может содержать 20 и более символов");
        }
        if (login.contains(" ")) {
            tmp = false;
            throw new WrongLoginException("Логин не может содержать пробелы");
        }
        if (password.length() >= 20) {
            tmp = false;
            throw new WrongPasswordException("Пароль не может содержать 20 и более символов");
        }
        if (password.contains(" ") || !password.matches(".*\\d+.*")) {
            tmp = false;
            throw new WrongPasswordException("Пароль не может содержать пробелы и должен содержать хотя бы одну цифру");
        }
        if (!password.equals(confirmPassword)) {
            tmp = false;
            throw new WrongPasswordException("Введенные пароли не совпадают");
        }

        return tmp;
    }
}

