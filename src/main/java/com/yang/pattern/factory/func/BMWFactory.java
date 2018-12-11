package com.yang.pattern.factory.func;

import com.yang.pattern.factory.BMWCar;
import com.yang.pattern.factory.Car;

/**
 * 宝马制造厂
 */
public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
