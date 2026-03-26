import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double altura, base, perimetro, area;

        //entrada de dados
        System.out.print("Digite o valor da altura do retângulo: ");
        altura = sc.nextDouble();

        System.out.print("Digite o valor da base do retângulo: ");
        base = sc.nextDouble();

        //processamento de dados

        perimetro = (altura + base)*2;
        area = altura * base;

        //saída de dados

        System.out.print("O valor do perímetro desse retângulo é "+ perimetro);
        System.out.println("");
        System.out.print("O valor da área desse retângulo é: "+area);
    }
}
