package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite el 1er Valor = ");
        x = sc.nextInt();
        System.out.println("Digite el 2ndo Valor = ");
        y = sc.nextInt();

        Operaciones obj = new Operaciones(x, y);
        obj.Sumar();
        obj.Restar();
        obj.Multiplicar();
        obj.Dividir();
        System.out.println();
        obj.Potencia();
        System.out.println();
        obj.Raiz();
    }
}
