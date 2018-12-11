package com.yang.pattern.factory.func;

import com.yang.pattern.factory.AudiCar;
import com.yang.pattern.factory.Car;

/**
 * 奥迪制作厂
 */
public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new AudiCar();
    }
}
