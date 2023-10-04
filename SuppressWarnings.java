package com.hspedu.annotation;


import java.util.ArrayList;
import java.util.List;

//1、当不希望看到警告时，可以使用 SuppressWarnings 注解来抑制警告信息。
//2、在({""})中，可以写入希望抑制（不显示）的警告信息。
//3、可以制定警告类
//4、SuppressWarnings 作用范围，与放置的位置相关。
//例：SuppressWarnings放置在main方法，抑制警告的范围就是main方法
//通常我们可以放置具体的语句，方法，类
//源代码
//（1）放置的位置 type field method parameter constructor local_variable
//（2）vaule 可以指定多种要抑制的数据。该注解类有个数组String[]values()设置一个数组
//比如{"Unchecked" "Rawtypes" "Unused"}

/*
// Implicitly target all declaration contexts by omitting a @Target annotation
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {
   String[] value();
}
 */
public class SuppressWarnings {
    @java.lang.SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
}
