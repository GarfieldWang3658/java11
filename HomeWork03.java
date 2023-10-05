package com.hspedu;

public class HomeWork03 {
    public static void main(String[] args) {
        Animal cat = new cat();
        cat.shout();
        Animal dog = new dog();
        dog.shout();
    }
}
abstract class Animal {
    abstract void shout();
}
class cat extends Animal{
    @Override
    void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗会汪汪叫");
    }
}

