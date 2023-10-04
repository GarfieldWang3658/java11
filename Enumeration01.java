package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        Season_ Spring = new Season_("春天", "温暖");
        Season_ Winter = new Season_("冬天", "寒冷");
        Season_ Summer = new Season_("夏天", "炎热");
        Season_ Autumn = new Season_("秋天", "凉爽");
        //对于季节而言，他的对象（具体值）是固定的，不会有更多的
        //这个类的设计思路，不能体现季节是有限的，固定的4个对象
        //因此这样的设计不要好===》枚举类【枚：一个个，举：列举，把具体的对象一个一个列举出来的类】
        //称为枚举类
        Season_ other = new Season_("123", "123");

    }
}
class Season_{
    public String name;
    private String desc;

    public Season_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
