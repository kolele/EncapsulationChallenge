package com.kole;

public class Main {

    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(40,0,true);
        Printer singleSidePrinter = new Printer(24,0,false);

        int amountPrinted = duplexPrinter.print(6);
        System.out.println(amountPrinted);

        System.out.println("*******************************************************************");

        amountPrinted = singleSidePrinter.print(7);
        System.out.println(amountPrinted);
    }
}
