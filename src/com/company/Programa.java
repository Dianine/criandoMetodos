package com.company;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        //Chamando Método
        Calculadora.soma(2,2);
        Calculadora.multiplicacao(2,3);
        Calculadora.divisao(12,2);
        Calculadora.subtracao(10,2);

        System.out.println("---------------------------");

        //Mensagem
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        System.out.println("---------------------------");

        //Quadrilatero
        Quadrilatero.areaQuadrado(3);
        Quadrilatero.areaRetangulo(5,5);
        Quadrilatero.areaTrapezio(7,8,9);

}
}