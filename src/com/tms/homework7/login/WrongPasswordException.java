package com.tms.homework7.login;

/**
 * Класс исключения для проверки Пароля
 */

public class WrongPasswordException extends Exception{

    private WrongPasswordException() {}

    public WrongPasswordException(String message) {
        super(message);
    }
}
