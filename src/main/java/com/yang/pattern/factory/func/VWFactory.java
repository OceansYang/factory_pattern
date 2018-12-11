package com.yang.pattern.factory.func;

import com.yang.pattern.factory.Car;
import com.yang.pattern.factory.VWCar;

/**
 * 大众制造厂
 */
public class VWFactory implements Factory {
    @Override
    public Car getCar() {
        return new VWCar();
    }
}
