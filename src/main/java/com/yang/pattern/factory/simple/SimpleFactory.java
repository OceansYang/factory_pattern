package com.yang.pattern.factory.simple;

import com.yang.pattern.factory.AudiCar;
import com.yang.pattern.factory.BMWCar;
import com.yang.pattern.factory.Car;
import com.yang.pattern.factory.VWCar;

/**
 *  汽车制造
 */
public class SimpleFactory {

    /**
     * 根据传入的名字来决定需要哪一种汽车
     *
     * @param name
     * @return
     */
    public Car getCar(String name) {
        if ("大众".equals(name)) {
            return new VWCar();
        } else if ("奥迪".equals(name)) {
            return new AudiCar();
        } else if ("宝马".equals(name)) {
            return new BMWCar();
        } else {
            return null;
        }

    }
}
