package com.hspedu;

public class HomeWork04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //1、匿名内部类是：
        /*
     new computer() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },同时也是一个对象
        //编译类型是接口类型 computer。运行类型就是匿名内部类
         */
        cellPhone.testWork(new computer() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
    }
}
interface computer{
    public double work(double n1,double n2);
}
class CellPhone {
    //当调用testwork方法时，直接传入，一个实现了computer接口的匿名内部类即可
    //该匿名内部类可以灵活实现work方法，完成不同的计算任务

    public void testWork(computer computer, double n1, double n2) {
        double result = computer.work(n1, n2);//动态绑定
        System.out.println("计算后的结果为=" + result);

    }
}

