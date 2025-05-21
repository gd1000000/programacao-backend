package com.mycompany;

import java.util.Scanner;

public class Aula05Repeticao {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For (Para)
         * 
         * Para cada elemento repita
         * 
         * 1° variável de iteração
         * 2° condição de parada
         * 3° incremento ou decremento
         */
        // Incremento
        for(int i = 0;i < 10; i = i +2) {
            System.out.println(i);
        }

        // Decremento
        System.out.println("Contagem regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Booom !!");

System.out.print("Booom !!");
/**
 * Classe Scanner
 * 
 * É utilizada para ler valores do usuário inseridas pelo prompt
 */
    Scanner scan = new Scanner(Sistem.in); // Criar o scanner
        System.out.print("Digite um número: ");

        int numero = scan.nextInt(); // lê o valor digitado e capturado pelo scanner
        System.out.print("Você digitou " + numero + "!!");

        /**
         * Do while (execute, enquanto)
         * 
         * É executada uma estrutura de codigo er após é validada a condição
         */

         int num2 = 1;
         do{
            Scanner scan = new Scanner(System.in);
            System.out.println(x:"Digite um número: (0para Sair)");

            num2 = scan.nextInt();
         } while (num2 != 0);

         System.out.println(x:"Execução encerrada");
    }
}