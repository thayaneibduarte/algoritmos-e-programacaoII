package Calculadora;
import java.util.Scanner;

public class Calculo {

    static Scanner calc = new Scanner (System.in);

    public String Calcular () {

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        int resp = calc.nextInt();

    }
    private static void Operacoes (int[] args) {

    }
}