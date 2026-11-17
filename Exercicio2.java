import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {

double numero;
double numero2;
double soma;
double subitracao;
double divisao;
double multiplicacao;


Scanner entrada = new Scanner(System.in);

System.out.print("Informe um numero: ");
numero = entrada.nextInt();

System.out.print("Informe outro numero: ");
numero2 = entrada.nextInt();

soma = numero+numero2;
subitracao = numero-numero2;
divisao = numero/numero2;
multiplicacao = numero*numero2;

System.out.println("soma: " +soma+ " subitracao: " +subitracao+ " divisão: "+divisao+ " multiplicacão" +multiplicacao);

}
}