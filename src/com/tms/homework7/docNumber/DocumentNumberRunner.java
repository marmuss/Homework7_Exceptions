package com.tms.homework7.docNumber;

public class DocumentNumberRunner {
    public static void main(String[] args) {

        String documentNumber = "5854-Dfr-6785-Abc-1a2B";

        try {
            System.out.println("Проверка номера документа");
            CheckingTheDocNumber.checkABC(documentNumber);
            CheckingTheDocNumber.check555(documentNumber);
            CheckingTheDocNumber.check1a2b(documentNumber);
            System.out.println("Номер документа верный");
        } catch (InvalidDocNumberExceptionABC | InvalidDocNumberException555 | InvalidDocNumberException1a2b e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
    }
}
