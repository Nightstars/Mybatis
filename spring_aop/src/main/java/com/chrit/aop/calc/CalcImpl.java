package com.chrit.aop.calc;

import org.springframework.stereotype.Component;

@Component
public class CalcImpl implements Calc{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
