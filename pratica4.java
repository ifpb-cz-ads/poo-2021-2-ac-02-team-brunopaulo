/* Crie um programa que elabore o orçamento de uma construtora
        para o cálculo do valor total de construção de uma piscina. O valor
        total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
        que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
        programa para ver se está tudo funcionando corretamente. */

public class pratica4 {
    public static final float preco = 100; // Definindo "preço" como variável global e atribuindo o valor "100" para ela
    public static void main (String[] args){
        double metros = 20, valor; //Declarando as variáveis
        valor = preco * metros; // Multiplicando a área por metros para saber o custo da piscina
        System.out.print(valor);
    }
}
