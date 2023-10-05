package com.hspedu;

public class HomeWork07 {
    public static void main(String[] args) {

        CAR car01 = new CAR(33.0);
        CAR car02 = new CAR(50.0);
        CAR car03 = new CAR(-12);
        car01.getAir().flow();
        car02.getAir().flow();
        car03.getAir().flow();
    }
}
class CAR {
    private double temprature;

    public CAR(double temprature) {
        this.temprature = temprature;
    }

    class Air {//成员内部类。
        public void flow() {
            if (temprature>40.0){
                System.out.println("空调吹冷风");
            }
            if (temprature<0){
                System.out.println("空调吹暖风");
            }
                System.out.println("空调关闭");
        }

        }
    public Air getAir(){
        return new Air();
    }
}

