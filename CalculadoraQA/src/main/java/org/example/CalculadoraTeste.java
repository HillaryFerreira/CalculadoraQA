package org.example;

/**
 * 
 * @author Hillary
 */

public class CalculadoraTeste {
    public static void main(String[] args) {

         // Criando variáveis 
        double soma, subtrair, multplicacao, divisao;
        
        // Instanciando a calculadora
        Calculadora calculadora = new Calculadora();
        
        //Cenário de teste 1: Soma de dois números positivos
        soma = calculadora.somar(3, 7);
        System.out.println("Case Soma 1: " + soma);

        //Cenário de teste 2: Soma de dois valores, sendo um dele zero
        soma = calculadora.somar(3, 0);
        System.out.println("Case Soma 2: " + soma);

        //Cenário de teste 3: Soma de dois valores, sendo ambos zero
        soma = calculadora.somar(0, 0);
        System.out.println("Case Soma 3: " + soma);

        //Cenário de teste 4: Soma de dois valores, um deles negativo
        soma = calculadora.somar(3, -1);
        System.out.println("Case Soma 4: " + soma + "\n**********************");

        //Cenário de teste 1: Subtração de dois números positivos
        subtrair = calculadora.subtrair(3, 7);
        System.out.println("Case Subtração 1: " + subtrair);

        //Cenário de teste 2: Subtração de dois números positivos sendo um zero
        subtrair = calculadora.subtrair(3, 0);
        System.out.println("Case Subtração 2: " + subtrair);

        //Cenário de teste 3: Subtração de dois números positivos sendo eles zero
        subtrair = calculadora.subtrair(0, 0);
        System.out.println("Case Subtração 3: " + subtrair);

        //Cenário de teste 4: Subtração de dois números sendo um negativo
        subtrair = calculadora.subtrair(3, -1);
        System.out.println("Case Subtração 4: " + subtrair + "\n**********************");

        //Cenário de teste 1: Multiplicação de dois valores positivos
        multplicacao = calculadora.multiplicar(3, 7);
        System.out.println("Case Multiplicação 1: " + multplicacao);

        //Cenário de teste 2: Multiplicação de dois valores sendo um zero
        multplicacao = calculadora.multiplicar(3, 0);
        System.out.println("Case Multiplicação 2: " + multplicacao);

        //Cenário de teste 3: Multiplicação de dois valores, ambos sendo zero
        multplicacao = calculadora.multiplicar(0, 0);
        System.out.println("Case Multiplicação 3: " + multplicacao);

        //Cenário de teste 4: Multiplicação de dois valores sendo um negativo
        multplicacao = calculadora.multiplicar(3, -1);
        System.out.println("Case Multiplicação 4: " + multplicacao + "\n**********************");

        //Cenário de teste 1: Divisão de dois valores
        divisao = calculadora.dividir(3, 7);
        System.out.println("Case Divisão 1: " + divisao);

        //Cenário de teste 2: Divisão de dois valores sendo um zero
        divisao = calculadora.dividir(3, 0);
        System.out.println("Case Divisão 2: " + divisao);

        //Cenário de teste 3: Divisão de dois valores sendo ambos zero
        divisao = calculadora.dividir(0, 0);
        System.out.println("Case Divisão 3: " + divisao);

        //Cenário de teste 4: Divisão de dois valores sendo um negativos
        divisao = calculadora.dividir(3, -1);
        System.out.println("Case Divisão 4: " + divisao);
    }
}
