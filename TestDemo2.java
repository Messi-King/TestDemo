package com.bit.lambdademo;

import java.util.ArrayList;
import java.util.HashMap;


class Test {
    public void func(){}
}
@FunctionalInterface
interface NoParameterNoReturn2 {
    void test();
}


public class TestDemo2 {


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "bit");
        map.put(3, "hello");
        map.put(4, "lambda");
       /* map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("key: "+integer +" value: "+s);
            }
        });*/
       /* map.forEach((key,value) -> {
            System.out.println("key: "+key +" value: "+value);
        });*/

        map.forEach((key,value) -> System.out.println("key: "+key +" value: "+value));
    }

    public static void main4(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cello");
        list.add("bit");
        list.add("dello");
        list.add("aambda");
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
        //list.sort( (o1,o2)->{return o1.compareTo(o2);});
        list.sort( (o1,o2)-> o1.compareTo(o2) );
        //System.out.println(list);
        list.forEach((s)->System.out.println(s));
    }

    public static void main3(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bit");
        list.add("hello");
        list.add("lambda");
        list.forEach((s)->System.out.println(s));

       /* list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/



    }

    public static void main2(String[] args) {
        int a = 99;
        //a = 9999;
        NoParameterNoReturn2 np = ()->{
            //a = 88;
            System.out.println(a);
        };
        np.test();
    }
    /**
     * 匿名内部类当中  捕获的变量 一定是常量或者
     * 没有发生过改变的量
     * @param args
     */
    public static void main1(String[] args) {
        final int a = 10;
        new Test(){
            public void func(){
                System.out.println(a);
            }
        }.func();

    }
}
