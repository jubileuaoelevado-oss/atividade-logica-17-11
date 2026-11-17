import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {

double anos;
double dias;

Scanner entrada = new Scanner(System.in);

System.out.print("Informe uma quantia de anos: ");
anos = entrada.nextInt();

dias = anos*365; 


System.out.println("A medida em dias é: " +dias);

}
}