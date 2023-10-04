package com.hspedu.enum_;

import java.sql.SQLOutput;

public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2的枚举类，来实现各种方法。
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对像的次序//编号，从0开始
        //AUTUMN枚举对象是第三个，因此输出2
        System.out.println(autumn.ordinal());
        //从反编译，可以看出 values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("===遍历取出枚举 ");
        for (Season2 season : values) {//增强for循环
          System.out.println(season);
        }


        //valueof
        //将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常。
        //执行流程：
        //1、更具输入的名称到枚举对象去查找
        //2、如果找到就返回，如果没有找到就报错。
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autum="+autumn1);
        System.out.println(autumn==autumn1);

        //compareTo 比较两个常量，比较的就是编号
        //用Season2.AUTUMN 枚举对象编号与Season2.SUMMER 枚举对象编号进行对比
        //结果
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
        //        return self.ordinal - other.ordinal;




//        int[] nums = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("================");
//        for (int i : nums) {
//            //执行流程=依次从nums数组中取出数据，赋给i，如果取出完毕则退出for
//            System.out.println(i);
        }
    }

    enum Season2 {
        SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽");
        private String name;
        private String desc;//描述

        private Season2(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }
        public String getDesc() {
            return desc;
        }
    }



