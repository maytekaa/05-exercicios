import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        //declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, distancia, litros, km;
        km = 10.5;


        //entrada de dados
        System.out.print("Digite a velocidade média do automóvel: ");
        velocidade = sc.nextDouble();

        System.out.print("Digite o tempo gasto na viagem do automóvel: ");
        tempo = sc.nextDouble();

        System.out.print("O automóvel faz: "+ km +"km/l");

        //processamento de dados

        distancia = velocidade * tempo; //distancia percorrida
        litros = distancia/km; //combustivel gasto

        //saida de dados
        System.out.println("");
        System.out.print("A quantidade de litros de combustível gasta foi: "+ litros);

    }
}
