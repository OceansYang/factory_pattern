package com.yang.pattern.factory.abstr;

import com.yang.pattern.factory.Car;

/**
 * 抽象工厂类
 * 对外提供API，内部实现改造
 */
public abstract class AbstractFactory {

    /**
     * 获得一个奥迪汽车
     * @return
     */
    public abstract Car getAudi();

    /**
     * 获得一个宝马汽车
     * @return
     */
    public abstract Car getBMW();

    /**
     * 获得一个大众汽车
     * @return
     */
    public abstract Car getVW();

}
