import java.util.Scanner;
import java.util.InputMismatchException;

public class AulaPratica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;

        while (true) {
            try {
                System.out.print("Digite o valor de a: ");
                a = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número real!");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o valor de b: ");
                b = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número real!");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Digite o valor de c: ");
                c = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número real!");
                scanner.nextLine();
            }
        }

        try {
            double x1 = Equacao.raizEq2GrauX1(a, b, c);
            double x2 = Equacao.raizEq2GrauX2(a, b, c);
            System.out.println("Raiz X1 = " + x1);
            System.out.println("Raiz X2 = " + x2);
        } catch (NaoTemRaizesReaisException e) {
            System.out.println("Erro:" + e.getMessage());
        }

        scanner.close();
    }    
}
