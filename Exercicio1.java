import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {

int numero;
int sucesor;
int antecessor;

Scanner entrada = new Scanner(System.in);

System.out.print("Informe um numero: ");
numero = entrada.nextInt();

sucesor = numero+1;
antecessor = numero-1;

System.out.println("sucessor: " +sucesor+ " antecessor: " +antecessor);

}
}