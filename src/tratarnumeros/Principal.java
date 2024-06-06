package tratarnumeros;

import java.util.Scanner;

public class Principal {

    static int numero;
    static String opcao;
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("#### MEU SOFTWARE ####");
        System.out.println("1-Descobrir se o numero e par ou impar");
        System.out.println("2-Descobrir se o numero e positivo ou negativo");
        System.out.print("Escolha uma opcao ou digite qualquer tecla para sair: ");

        opcao = leia.next();

        if (opcao.equals("1")) {
            parOuImpar();
        } else if (opcao.equals("2")) {
            positivoOuNegativo();
        } else {
            System.out.println("Sair do programa");
        }
    }

    public static void parOuImpar() {
        System.out.print("Digite um numero: ");
        numero = leia.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero PAR");
        } else {
            System.out.println("Numero IMPAR");
        }
    }

    public static void positivoOuNegativo() {
        System.out.print("Digite um numero: ");
        numero = leia.nextInt();
        if (numero < 0) {
            System.out.println("Numero Negativo");
        } else if (numero == 0) {
            System.out.println("Numero Neutro");
        } else {
            System.out.println("Numero Positivo");
        }
    }

}
