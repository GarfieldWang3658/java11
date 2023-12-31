package com.hspedu.enum_;

public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("===所有星期的信息如下===");
        for(Week week:values){
            System.out.println(week);
        }
    }
}
class A{}
enum Week {//不能继承，原因enum有一个隐式继承。
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"), THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"), SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
