import java.util.Scanner;

public class atividade_for01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();


        for (int i=1; i<= X; i++){
            if ( i % 2 != 0 ){

                System.out.println(i);
            }




        }
    }
}
