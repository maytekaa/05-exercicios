import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        //declaraco de variaveis
        double valorHora, salarioBruto, salarioLiquido, porcentagem, descontoInss;
        int numeroHoras;
        Scanner sc = new Scanner(System.in);


        //entrada de dados
        System.out.print("Informe o valor da sua hora trabalhada: ");
        valorHora = sc.nextDouble();

        System.out.print("Informe o número de horas trabalhadas: ");
        numeroHoras = sc.nextInt();

        System.out.print("Informe a porcentagem de desconto do INSS: ");
        porcentagem = sc.nextDouble();

        //processamento de dados
        salarioBruto = valorHora * numeroHoras;

        descontoInss = salarioBruto * (porcentagem/100);

        salarioLiquido = salarioBruto - descontoInss;

        //saida de dados
        System.out.print("O valor do salário bruto é R$ "+ salarioBruto);
        System.out.println("");

        System.out.print("O valor de desconto do INSS é R$ "+ descontoInss);
        System.out.println("");

        System.out.print("O valor do salário líquido é R$ "+
                String.format("%.2f", salarioLiquido)); //formatação do número ponto flutuante para mostrar apenas duas casas decimais

    }
}
