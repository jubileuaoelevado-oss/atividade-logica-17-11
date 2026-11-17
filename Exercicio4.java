import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {

double metros;
double centimetros;

Scanner entrada = new Scanner(System.in);

System.out.print("Informe uma quantia em metros: ");
metros = entrada.nextInt();

centimetros = metros*100; 


System.out.println("A medida em cetimetros é: " +centimetros);

}
}