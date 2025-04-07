package com.example;

public class Calculadora {
    public int somar(int num1, int num2){
        return num1+ num2;
    }

    public int expoente(int num, int exp){
        int total = 1;
        for(int e = exp; e>0; e-- ){
            total = total *num;
        }
        return total;

    }
}
