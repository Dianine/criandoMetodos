package com.company;

public class Quadrilatero {
    public static void areaQuadrado (double lado){
        System.out.println("Area do Quadrado: " + lado);
    }
    public static void areaRetangulo (double ladoA, double ladoB){
        System.out.println("Area do Retângulo: " + ladoA * ladoB);
    }
    public static void areaTrapezio (double baseMaior, double baseMenor, double altura){
        System.out.println("Area do Trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }

}
