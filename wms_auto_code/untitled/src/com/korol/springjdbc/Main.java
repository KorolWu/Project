package com.korol.springjdbc;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static final String print = "System.out.print";
    public static void main(String[] args)
    {
        System.out.println("hello word");
        List arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Kl-90-12");
        arrayList.add(false);
        System.out.print("print arrayLIst: ");
        System.out.println(arrayList);
        List<String> strList = new ArrayList<String>();
        List<Integer> intList = new ArrayList<Integer>();
        Class strClass = strList.getClass();
        Class intClass = intList.getClass();
        if( strClass.equals(intClass))
        {
            //泛型的作用只体现在编译阶段，逻辑上是不同类型，实际上是相同的
            System.out.println("类型是相等的");
        }
        //test printTest
        printTest("agr1","agr2","agr3","agr4","agr5");
        Typet<String> strT = new Typet<String>("hello");
        System.out.println("Type get value is: "+strT.getparam());


        Object obj = null ;
        System.out.println("Type get value is: "+strT.functionT("hello ","world!",obj));
        System.out.println("function result is "+obj);
        System.out.println("-----------------------------");
        System.out.println(strT.function2("参数1","参数2"));
        List<String> strListTest = new ArrayList<String>();
        Map<Integer,String> map = new HashMap<>();
        System.out.println(1<<4);
    }
    public static <E> void printTest(E ...args)
    {
        for (E item : args)
        {
            System.out.println(item);
        }
    }
}
