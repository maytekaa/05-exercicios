import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        //declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        //entrada de dados
        System.out.print("Informe o valor de graus Celsius: ");
        celsius = sc.nextDouble();

        //processamento de dados
        fahrenheit = celsius*9.0/5 + 32; //parenteses não é necessário (a linguagem lê ---> nesse sentido)
        //

        //saida de dados
        System.out.print(celsius +"°C = "+ fahrenheit +"°F");


    }
}
