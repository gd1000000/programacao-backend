package com.mycompany.exercicios;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * Exercícios sobre operadores
         * 
         * 1) Crie um programa que calcule e retorne a média de um aluno na disciplina de Física, 
         * Ele tirou as notas: 8, 6.7, 8.1, 9.4
         * 
         * 2) Faça o cálculo de IMC de um aluno, você deve guardar informações como Peso e Altura
         * e retornar o resultado.
         * 
         * 3) Faça um programa que retorne o valor do produto e o valor com desconto, 
         * para o exercício considere um desconto de 35%.
         */

        // 1)
        float soma = 8f + 6.7f + 8.1f + 9.4f;
        float media = soma / 4f;
        System.out.println("1) A média do aluno foi: " + media);

        // 2)
        // Definindo o valor de PI
        double pi = Math.PI;  // Você pode usar 3.14 se preferir
        
        // Definindo a área do círculo
        double area = 25.0;
        
        // Calculando o raio
        double raio = Math.sqrt(area / pi);
        
        // Calculando a área a partir do raio
        double areaCalculada = pi * Math.pow(raio, 2);
        
        // Exibindo os resultados
        System.out.println("O raio do círculo é: " + raio + " cm");
        System.out.println("A área calculada do círculo é: " + areaCalculada + " cm²");

        // "3"
        // Preço original do produto
        double precoOriginal = 1200.00;
        
        // Percentual de reajuste (15%)
        double percentualReajuste = 0.15;
        
        // Calculando o valor do reajuste
        double reajuste = precoOriginal * percentualReajuste;
        
        // Calculando o novo preço com o reajuste
        double novoPreco = precoOriginal + reajuste;
        
        // Exibindo o resultado
        System.out.println("Preço original do produto: R$ " + precoOriginal);
        System.out.println("Reajuste de 15%: R$ " + reajuste);
        System.out.println("Novo preço após o reajuste: R$ " + novoPreco);

        // "4"
         // Preço original do produto
        double precoOriginal = 850.00;
        
        // Percentual de desconto (30%)
        double percentualDesconto = 0.30;
        
        // Calculando o valor do desconto
        double desconto = precoOriginal * percentualDesconto;
        
        // Calculando o novo preço com o desconto
        double novoPreco = precoOriginal - desconto;
        
        // Exibindo o resultado
        System.out.println("Preço original do produto: R$ " + precoOriginal);
        System.out.println("Desconto de 30%: R$ " + desconto);
        System.out.println("Novo preço após o desconto: R$ " + novoPreco);
    }
}