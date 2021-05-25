package com.tms.homework7.docNumber;

/**
 * Класс исключение для проверки на содержание в номере документа последовательности 1a2b
 */
public class InvalidDocNumberException1a2b extends Exception{
    public InvalidDocNumberException1a2b(String message) {
        super(message);
    }
}
