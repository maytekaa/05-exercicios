import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        //declaração de variaveis
        Scanner sc = new Scanner(System.in);
        int valor, dezena;

        //entrada de dados
        System.out.print("Informe o valor com 3 digitos (100 - 999): ");
        valor = sc.nextInt();

        //processamento de dados
        dezena = valor % 100 / 10  ; // % -> depois da virgula    / -> antes da virgula

        //saida de dados
        System.out.print("Dezena: "+ dezena);

    }
}
