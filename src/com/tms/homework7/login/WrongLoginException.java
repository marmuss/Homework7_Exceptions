package com.tms.homework7.login;

/**
 *  Класс исключения для проверки Логина
 */

public class WrongLoginException extends Exception{

    private WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
