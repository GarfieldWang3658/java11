package com.hspedu.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//ok
        Gender2 boy2 = Gender2.BOY;//ok

        System.out.println(boy);//输出BOY//本质就是调用Gender2的父类(Enum)的toString()方法
        // Boy boy.toString()
        System.out.println(boy2==boy);//true


    }
}
enum Gender{//调用了了Gender的无参构造器，
    BOY,GIRL;
//    private Gender(String name){}
//    Gender() {}
}
//一个枚举类Gender，没有属性
//有两个枚举对象，BOY，GIRL，使用的无参构造器创建

enum Gender2{
    BOY,GIRL;

}

