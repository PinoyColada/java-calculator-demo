package com.Calculator;

public class Calc {
    double num1;
    double num2;


    public Calc(double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1 / num2;
    }

}