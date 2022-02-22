package com.company;

import java.util.Scanner;

public class Calculadora {

    public static void soma(int n1, int n2) {
        double result = n1 + n2;
        System.out.println("------Calculadora------");
        System.out.println("A soma de " + n1 +" + "+ n2 + " é: " + result);
    }
    public static void multiplicacao(int n1, int n2) {
        double result = n1 + n2;
        System.out.println("A Multiplicação de " + n1 +" * "+ n2 + " é: " + result);
    }
    public static void divisao(int n1, int n2) {
        double result = n1 + n2;
        System.out.println("A Divisão de " + n1 +" / "+ n2 + " é: " + result);
    }
    public static void subtracao(int n1, int n2) {
        double result = n1 + n2;
        System.out.println("A Substração de " + n1 + " - " + n2 + " é: " + result);
    }

}
