
import java.util.Scanner;

public class Beecrowd1065 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int valores[] = new int[5];
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
            if (valores[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println(pares + " valores pares");
    }
}
