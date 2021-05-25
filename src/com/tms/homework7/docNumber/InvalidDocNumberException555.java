package com.tms.homework7.docNumber;
/**
 * Класс исключение для проверки на содержание в номере документа последовательности 555
 */
public class InvalidDocNumberException555 extends Exception{
    public InvalidDocNumberException555(String message) {
        super(message);
    }
}
