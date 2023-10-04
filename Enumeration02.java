package com.hspedu.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);


    }
}

//演示自定义枚举
class Season{
    public String name;
    private String desc;
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    //1、构造器私有化，防止直接被 new

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //2、去掉set相关方法，防止属性被修改

    //3、在该类内部直接创建固定（规定）的对象

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
