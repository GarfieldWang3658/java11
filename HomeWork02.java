package com.hspedu;

public class HomeWork02 {
    public static void main(String[] args) {

    }
}
class Frock{
    private static int currentNum=100000;
    private int serialNumber;

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = Frock.getNextNum();
    }
}
class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock01 = new Frock();
        Frock frock02 = new Frock();
        Frock frock03 = new Frock();
        System.out.println(frock01.getSerialNumber());
        System.out.println(frock02.getSerialNumber());
        System.out.println(frock03.getSerialNumber());

    }
}