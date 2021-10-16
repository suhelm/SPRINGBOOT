package com.example.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;

public class MultiplicationServiceImpl implements MultiplicationService{

    private RandomGeneratorService randomGeneratorService;
    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService){
        this.randomGeneratorService=randomGeneratorService;
    }
    @Override
    public Multiplication createRandomMultiplication() {
       int factorA=randomGeneratorService.generateRandomFactor();
       int factorB=randomGeneratorService.generateRandomFactor();
       return new Multiplication(factorA,factorB);
    }
}
