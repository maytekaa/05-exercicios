import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        //declaraco de variaveis
        Scanner sc = new Scanner(System.in);
        int valor, valorInvertido, unidade, dezena, centena;

        //entrada de dados
        System.out.print("Informe o valor com 3 digitos (100 = 999): ");
        valor = sc.nextInt();


        //processamento de dados
        unidade = valor % 10;
        dezena = valor % 100 /10;
        centena = valor /100;

        //processamento correto
        valorInvertido = unidade * 100 + dezena * 10 + centena;
        //processamento errado
        System.out.print(unidade + "" + dezena + "" + centena);

        //saida de dados
        System.out.print("O novo valor é: "+ valorInvertido);
    }
}
