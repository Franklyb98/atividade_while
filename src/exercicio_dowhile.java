import java.util.Locale;
import java.util.Scanner;

public class exercicio_dowhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;



        do{


            System.out.println("Digite a temperatura em Celcius: ");
            double C = sc.nextDouble();
            double R = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n " , R);
            System.out.println("Deseja repetir (s/n) ? ");
            resp = sc.next().charAt(0);
        }while ( resp != 'n');{
            System.out.println("Obrigado por usar :D ");
        }

    }
}