package com.hspedu.annotation;

public class Override {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){//父类
        System.out.println("fly");
    }
}
class Son extends Father{//继承了父类
    @java.lang.Override//语法校验。
    //1、@Override，注释放在fly方法上面，表示子类的fly方法时重写了父类fly方法。
    //2、假设没有   @Override 注解，还是冲洗了fly方法。
    //3、如果写了 @Override 注，那么编译器就会去检查该方法是否真的重写了父类的方法，
    //   如果的确重写了，则编译通过，如果没有构成重写则编译错误。
    //4、@Override定义
    //@interface 表示一个注解类
    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {}
     */
    public void fly() {
        System.out.println("son fly");
    }
}

