package com.tms.homework7.docNumber;

/**
 * Класс содержит методы для работы с номером документа
 * checkABC - проверяет, есть ли в номере документа последовательность ABC
 * check555 - проверяет, начинается ли номер документа с 555
 * check1a2b - проверяет, заканчивается ли номер документа на 1a2b
 *
 */
public class CheckingTheDocNumber {


    public static void checkABC(String documentNumber) throws InvalidDocNumberExceptionABC {
        if (!documentNumber.toLowerCase().contains("abc")) {
            throw new InvalidDocNumberExceptionABC("Недействительный номер документа. Номер документа не содержит последовательность ABC");
        }
    }

    public static void check555(String documentNumber) throws InvalidDocNumberException555 {
        if (documentNumber.indexOf("555") != 0){
            throw new InvalidDocNumberException555 ("Недействительный номер документа. Номер документа не начинается с 555");
        }
    }

    public static void check1a2b(String documentNumber) throws InvalidDocNumberException1a2b {
        if (documentNumber.toLowerCase().indexOf("1a2b") != documentNumber.length() - 4){
            throw new InvalidDocNumberException1a2b ("Недействительный номер документа.Номер документа не заканчивается на 1a2b");
        }

    }



}
