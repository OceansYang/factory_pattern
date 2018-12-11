package com.yang.pattern.factory.abstr;

import com.yang.pattern.factory.AudiCar;
import com.yang.pattern.factory.BMWCar;
import com.yang.pattern.factory.Car;
import com.yang.pattern.factory.VWCar;
import com.yang.pattern.factory.func.AudiFactory;

/**
 *  抽象工厂实现类
 */
public class CarFactory extends AbstractFactory {
    @Override
    public Car getAudi() {
        return new AudiCar();
        //结合工厂方法
        //return new AudiFactory().getCar();
    }

    @Override
    public Car getBMW() {
        return new BMWCar();
        //结合工厂方法
        //return new BMWFactory().getCar();
    }

    @Override
    public Car getVW() {
        return new VWCar();
        //结合工厂方法
        //return new VWFactory().getCar();
    }
}
