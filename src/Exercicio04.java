import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        //declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double salario, valorUnidade, valorResidencia, valorDesconto ;
        int quilowatts;

        //entrada de dados
        System.out.print("Informe o valor do seu salário em R$: ");
        salario = sc.nextDouble();

        System.out.print("Informe quantos quilowatts sua residência gasta: ");
        quilowatts = sc.nextInt();

        //processamento de dados

        valorUnidade = (salario/7)/100; //ou: valorUnidade = salario /7 /100;

        valorResidencia = valorUnidade * quilowatts;

        System.out.print("O valor da sua conta é R$ "+ valorResidencia);

        System.out.print("O valor de cada quilowatts é R$ "+valorUnidade);
        System.out.println(" ");

        valorDesconto = (valorResidencia * 0.10) - valorResidencia ; //ou valorResidencia*0.9

        System.out.print("O valor da sua conta com desconto de 10% é R$ "+ valorDesconto);




    }

}
