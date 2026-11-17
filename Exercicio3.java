import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {

double numero;
double numero2;
double numero3;
double media;



Scanner entrada = new Scanner(System.in);

System.out.print("Informe suas notas: ");
numero = entrada.nextInt();

System.out.print("Informe outra nota: ");
numero2 = entrada.nextInt();

System.out.print("Informe outra nota: ");
numero3 = entrada.nextInt();


media = (numero+numero2+numero3) /3;


System.out.println("A media é: " +media);

}
}