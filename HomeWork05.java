package com.hspedu;

public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private String name = "jack";
    public void f1() {
    class B{
            private String name = "TOM";
            public void show () {
                System.out.println(name+"\t外部"+A.this.name);//TOM
                //如果重名，外部类的访问=外部类名.this.属性名
            }
        }B b = new B();
         b.show();
    }

}
