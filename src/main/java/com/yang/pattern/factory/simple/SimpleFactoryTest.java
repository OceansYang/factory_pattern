package com.yang.pattern.factory.simple;

/**
 * 小作坊式的工厂模型
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        //传入一个参数来获取所需的对象
        System.out.println(factory.getCar("大众"));
    }
}
