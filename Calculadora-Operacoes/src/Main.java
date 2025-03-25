import Calculadora.Calculo;

import java.util.Scanner;

public class Main {

    static Scanner inserir = new Scanner (System.in);

    public static void main (String [] args) {

        System.out.println("Olá, seja bem-vindo à calculadora diária! Para continuarmos com o nosso atendimento, por favor, escolha uma opção:");
        Menu();
    }

    public static void Menu (){

        System.out.println("Opção 1 - Iniciar o Programa");
        System.out.println("Opção 2 - Continuar na mesma Operação");
        System.out.println("Opção 3 - Voltar ao Menu");
        int resposta = inserir.nextInt();
        switch (resposta) {
            case 1:
                Calculo op = new Calculo();
                System.out.println(op.Calcular());
                System.out.println("Por gentileza, insira o primeiro valor desejado para o cálculo: ");
                int numero1 = inserir.nextInt();
                System.out.println("Por fim, insira o segundo valor desejado para o cálculo: ");
                int numero2 = inserir.nextInt();
                break;
            case 2:
                break;
            case 3:

        }

    }
}