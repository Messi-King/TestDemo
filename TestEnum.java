package com.bit.enumdemo;

import java.lang.reflect.Constructor;

   1、我们自己写的枚举类  会默认继承与Enum
    values:方法为什么不在Enum
   2、枚举的构造方法默认是私有的
   3、反射枚举
 
public enum TestEnum {
    //RED : 对象
    RED("红色",1),BLACK("黑色",2),
    WHITE("白色",4);

    public String color ;
    public int ordinal;

    /*TestEnum() {

    }*/

    TestEnum(String color,int ordinal) {
        this.color = color;
        this.ordinal = ordinal;
    }

    public static TestEnum getEnumKey (int key) {
        for (TestEnum t: TestEnum.values()) {
            if(t.ordinal == key) {
                return t;
            }
        }
        return null;
    }

    public static void reflectPrivateConstructor() {
        try {
            Class<?> classStudent =
                    Class.forName("com.bit.enumdemo.TestEnum");
            //注意传入对应的参数,获得对应的构造方法来构造对象,当前枚举类是提供了两个参数分别是String和int。
            Constructor<?> declaredConstructorStudent
                    = classStudent.getDeclaredConstructor(String.class,int.class,
                    String.class,int.class);

            //设置为true后可修改访问权限
            declaredConstructorStudent.setAccessible(true);


            Object objectStudent
                    = declaredConstructorStudent.newInstance("绿色",666,"fafa",99);
            TestEnum testEnum = (TestEnum) objectStudent;

            System.out.println("获得枚举对象："+testEnum);


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reflectPrivateConstructor();
    }

    public static void main2(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i].ordinal());
        }
        System.out.println(TestEnum.valueOf("BLACK"));

        TestEnum testEnum1 = BLACK;
        /*TestEnum testEnum2 = GREEN;
        System.out.println(testEnum1.compareTo(testEnum2));
        //序号
        System.out.println(BLACK.compareTo(GREEN));*/
    }
    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
           /* case GREEN:
                System.out.println("black");
                break;*/
            default:
                break;
        }
    }
}
