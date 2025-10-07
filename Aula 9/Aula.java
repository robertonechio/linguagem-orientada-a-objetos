import java.util.Scanner;

public class Aula {

    public int abs_if_else(int valor) {
        if (valor < 0) {
            return -valor;
        } else {
            return valor;
        }
    }

    public int abs_ternario(int valor) {
        return (valor < 0) ? -valor : valor;
    }

    public int somatorio_for(int numero) {
        int soma = 0;
        for(int i = 0; i <= numero; i++) {
            soma += i; 
        }
        return soma;
    }

    public int somatorio_while(int numero) {
        int soma = 0;
        int i = 0;
        while (i <= numero) {
            soma += i;
            i++;
        }
        return soma;
    }

    public int somatorio_dowhile(int numero) {
        int soma = 0;
        int i = 0;
        do {
            soma += i;
            i++;
        } while (i <= numero);
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor absoluto: ");
        int valor_absoluto = sc.nextInt();
        System.out.println("Digite o número para realizar o somatorio: ");
        int numero_somatorio = sc.nextInt();
        sc.close();
        Aula aula = new Aula();
        System.out.println("Valor absoluto usando if/else: " + aula.abs_if_else(valor_absoluto));
        System.out.println("Valor absoluto usando ternário: " + aula.abs_ternario(valor_absoluto));
        System.out.println("Somatorio de um número usando for: " + aula.somatorio_for(numero_somatorio));
        System.out.println("Somatorio de um número usando while: " + aula.somatorio_while(numero_somatorio));
        System.out.println("Somatorio de um número usando do-while: " + aula.somatorio_dowhile(numero_somatorio));
    }
}
