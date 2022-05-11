/* Crie um programa que calcule a área de um retângulo, declare e
        inicialize duas variáveis para testá-lo, imprimindo esses resultados na tela */

public class pratica3 {
    public static void main (String[] args){
        int a =3, b = 4, soma; // Declarando as variáveis
        double raiz;
        a= (int) Math.pow(a, 2);
        b= (int) Math.pow(b, 2); //Fazendo o cálculo do quadrado dos catetos
        soma = a+b;
        raiz= Math.sqrt(soma); // Calculando a raiz da soma dos catetos
        System.out.print(raiz);
    }
}