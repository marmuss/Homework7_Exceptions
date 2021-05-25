package com.tms.homework7.docNumber;
/**
 * Класс исключение для проверки на содержание в номере документа последовательности ABC
 */
public class InvalidDocNumberExceptionABC extends Exception {
    public InvalidDocNumberExceptionABC(String message) {
        super(message);
    }
}
