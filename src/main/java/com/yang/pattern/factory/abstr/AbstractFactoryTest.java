package com.yang.pattern.factory.abstr;

/**
 *  工厂测试类
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory factory = new CarFactory();

        //用户只需要选择相应的汽车。
        System.out.println(factory.getAudi());
    }
}
