package com.hspedu;

public class HomeWork06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Hores());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.common();
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.passRiver();
        tang.passFireHill();
    }
}
interface Vehicles{
    public void work();
}
class Hores implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下使用马儿前进");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河的时候使用船");
    }
}
class Fly implements Vehicles{
    @Override
    public void work() {
        System.out.println("过火焰山坐飞机");
    }
}
class Tools{
    //将方法做成static 比较方便。
    //马儿始终是统一匹马
    private static Hores horse = new Hores();//饿汉式
    public static Hores getHorse(){
//        return new Hores();
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Fly getfly(){
        return new Fly();
    }
}

class Person{
    private String name;
    private Vehicles vehilces;

    //在创建对象时，事先分配一个交通工具


    public Person(String name, Vehicles vehilces) {
        this.name = name;
        this.vehilces = vehilces;
    }
    //把具体的要求封装成方法。
    public void passRiver() {
        //判断当前的vehicles属性，属性是null就获取一艘船
        //放置始终使用的是传入马对象，
        //使用instanceOf
        //先得倒船
        if (!(vehilces instanceof Boat)) {//如果不是船】
            //判断当前的vehilces 是不是Boat，
            //vehicles为null，【vehilces instanceof Boat】=》false
            //vehicles为马对象，【vehilces instanceof Boat】=》false
            //vehicles为船对象，【vehilces instanceof Boat】=》true
            //使用的是多态
            vehilces = Tools.getBoat();
        }
        vehilces.work();
    }
    public void common(){
        if (!(vehilces instanceof Hores)) {
            vehilces = Tools.getHorse();
        }vehilces.work();
    }
    public void passFireHill(){
        if (!(vehilces instanceof Fly)){
            vehilces = Tools.getfly();
        }
        vehilces.work();
    }
}
