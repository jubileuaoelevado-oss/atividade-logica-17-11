import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {

int anos;
boolean ativa;

Scanner entrada = new Scanner(System.in);

System.out.print("Informe seu nome: ");
String nome = entrada.nextLine();

System.out.print("Informe sua idade: ");
anos = entrada.nextInt();

System.out.print("Informe se sua conte está ativa: ");
ativa = entrada.nextBoolean();


System.out.println("seu nome é: " +nome+ " sua idade é " +anos+ "sua conta está ativa ? "+ativa);

}
}