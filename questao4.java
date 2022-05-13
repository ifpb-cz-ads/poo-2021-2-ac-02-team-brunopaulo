/*      Questões referente ao Livro BatistaMoraes;
        Introdução a Orientação a Objetos
        Questão 4 :
        Declare uma variável chamada long1 do tipo long e a inicialize com 100.
        Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
        200. Agora faça int2 receber int1 mais long1 e explique os resultados.
        Arrume o código para que não ocorra o erro anterior.*/

public class questao4 {
    public static final double taxa = 0.825;
    public static void main(String args[]) {
        double valorItem1 = 2.95, valorItem2 = 3.50, soma, taxaCalculada, novoCusto;
        boolean muitoCaro;

        System.out.println("O item 1 custa: " + valorItem1 + "  e o item 2 custa: " +valorItem2);
        soma = valorItem1+valorItem2;

        System.out.println("O valor da soma dos itens eh: " + soma);

        taxaCalculada = soma + (taxa*soma);
        System.out.println(taxaCalculada);

        valorItem1 = valorItem1 + (taxa*valorItem1);
        valorItem2 = valorItem2 + (taxa*valorItem2);
        novoCusto = valorItem1+valorItem2;
        System.out.println(novoCusto);

        muitoCaro = novoCusto > 10;
        System.out.print(muitoCaro);
    }
}