package com.hspedu.annotation;

public class Deprecated {
}
//1、@Deprecated 修饰某个元素，表示该元素已经过时
//2、既不在推荐使用，但是仍然可以使用。
//3、查看源码
//4、可以修饰方法、类、字段、包、参数等
//5、可以做版本升级的过渡使用。
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface Deprecated {
 */
@java.lang.Deprecated
class AAA{
    public int n1 =10;
    public void hi(){}
}

