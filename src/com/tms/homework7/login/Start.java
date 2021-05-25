package com.tms.homework7.login;

public class Start {
    public static void main(String[] args) {

        try {
            if (Account.checkSignUp("Maria", "qwerty1", "qwerty1")){
                System.out.println("Регистрация прошла успешно");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
