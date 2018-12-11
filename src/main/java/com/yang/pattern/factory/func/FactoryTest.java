package com.yang.pattern.factory.func;

/**
 * 工厂测试类
 */
public class FactoryTest {

    public static void main(String[] args) {

        Factory factory = new BMWFactory();
        System.out.println(factory.getCar());
    }
}
