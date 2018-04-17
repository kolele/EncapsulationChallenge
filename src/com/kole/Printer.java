package com.kole;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {

        if (tonerLevel>0 && tonerLevel < 101){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int addToner(int amount){
        if ((this.tonerLevel + amount) < 101 ){
            System.out.println("Toner filled. Current toner level is " + getTonerLevel());
        } else {
            System.out.println("Current toner level is " + getTonerLevel() + " try filling less");
        } return getTonerLevel();
    }

    public int print(int printAmount){
        if (isDuplex){
            return printAmount/2;
        } else return printAmount;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
