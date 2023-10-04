package com.hspedu.enum_;

public class EnumDetial {
        public static void main(String[] args) {
            com.hspedu.enum_.Week[] values = com.hspedu.enum_.Week.values();
            System.out.println("===所有星期的信息如下===");
            for(com.hspedu.enum_.Week week:values){
                System.out.println(week);
                Music.JAZZMUSIC.play();
            }
        }
    }
    class AA{}
//使用enum关键自后，就不能在继承其他累了，因为enum会隐式继承Enum类，而java是单继承机制
//enum Week1 extends AA{} // 错
//2、enum实现的枚举类，仍然是一个类，所以还是可以实现接口的
interface IPlaying{
    public void play();
}
enum Music implements IPlaying{
    JAZZMUSIC;

    @Override
    public void play() {
        System.out.println("播放音乐");
    }
}
    enum Week1 {//不能继承，原因enum有一个隐式继承。
        MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"), THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"), SUNDAY("星期日");
        private String name;

        Week1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  name ;
        }
    }
