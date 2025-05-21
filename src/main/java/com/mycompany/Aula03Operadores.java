package com.mycompany;

public class Aula03Operadores {

        public static void main(String[] args) {
        /**
         * Tipos de Comentários
         */

        //Comentarios de uma linha

        /** 
         * Comentarios de 
         * Múltiplas
         * Linhas
        */

        /**
         * Declaração de variáveis 
         */
        String var1; // Toda variável declarada sem valor, automaticamente é null,
        String var2 = null; //Variável declarada com o valor null
        String var3 = ""; // Variável declarada com o valor vazio (diferente de null) 

        /**
         * Operadores Matematicos
         */

         int num1 = 10;
         int num2 = 2;

         // Soma
         int soma = num1 + num2;
         System.out.print("A soma entre " + num1 + "e" + num2 + " é: " +soma);

         // subtrção
         int subtrcao = num1 = num2;
         System.out.print("A  subtrcao de " + num1 + " por " + num2 + " é: " +  subtrcao);

         //Multiplicacao
         int multiplicacao = num1 + num2;
         System.out.print("A multiplicação de " + num1 + "por" + " é:" + multiplicacao);

         //Divisão
         int divisão = num1 / num2;
         System.out.print("A divisão de " + num1 + " por ");
    }
}
