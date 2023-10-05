package com.hspedu;

public class HomeWork08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();

        switch (red){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("没有匹配到");

        }

        }
    }


interface Show{
    public void show();
}
enum Color implements Show{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redvalue;
    private int greenvalue;
    private int bluevalue;

    Color(int redvalue, int greenvalue, int bluevalue) {
        this.redvalue = redvalue;
        this.greenvalue = greenvalue;
        this.bluevalue = bluevalue;
    }

    @Override
    public void show() {
        System.out.println("属性="+redvalue+","+greenvalue+","+bluevalue);
    }
}
