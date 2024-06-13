package tratarnumeros;

import java.util.Scanner;

public class Principal {

    static int numero;
    static String opcao;
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        		
        do{
            System.out.println("#### MEU SOFTWARE ####");
            System.out.println("1-Descobrir se o numero e par ou impar");
            System.out.println("2-Descobrir se o numero e positivo ou negativo");
            System.out.println("3-Calcular IMC");
            System.out.println("4-Tabuada de um numero");
            System.out.print("Escolha uma opcao do menu: ");

            opcao = leia.next();

            if (opcao.equals("1")) {
                parOuImpar();
            } else if (opcao.equals("2")) {
                positivoOuNegativo();
            }else if (opcao.equals("3")) {
                imc();
            }else if (opcao.equals("4")) {
                tabuada();
            }else{
                System.out.println("Opcao nao encontrada");
            }
            
            System.out.println("Digite sair para finalizar ou qualquer outra tecla para continuar.");
            opcao = leia.next();
        }while(!opcao.equals("sair"));
    }
    
     public static void imc() {
        
    }
    
    public static void tabuada() {
        
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
