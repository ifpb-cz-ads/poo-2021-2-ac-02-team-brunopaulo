/*Questões referente ao Livro BatistaMoraes;
        Introdução a Orientação a Objetos
        Questão 3:
        Crie um programa seguindo as orientações abaixo. Faça tudo que pede dentro do método main. */

/*public class questao3 {
    public static void main(String args[]) {
        long long1 = 100;
        int int1 = 200, int2;
        int2 = int1+long1;
    }
}*/ // Este código deu o erro: "/MyClass.java:5: error: incompatible types: possible lossy conversion from long to int"

public class questao3 {
    public static void main(String args[]) {
        long long1 = 100, long2;
        int int1 = 200, int2;
        long2 = int1+long1;
        System.out.print(long2); // Código correto com a correção
    }
} // O erro foi causado por conta que tentou armazenar um valor de 64 bits em tipo de 32 bits