package com.company;

public class Mensagem {
    public static void obterMensagem(int hora){
        switch (hora){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mesagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mesagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
                mesagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }

    private static void mesagemBoaNoite() {
        System.out.println("Boa Noite!");
    }

    private static void mesagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }

    private static void mesagemBomDia() {
        System.out.println("Bom Dia!");
    }
}
