package tratarnumeros;

import java.util.Scanner;

public class Principal {

    static int numero;
    static String opcao;
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        
        //COMENTARIOS PARA ESTUDO	
        /*for(int indice=10;indice <=  5;indice++){
            System.out.println("Valor de indice do for: "+indice);
        }
        
        int indice = 10; 
        while(indice <= 5){
           System.out.println("Valor de indice do while: "+indice);  
           indice++;
        }
        indice = 10;
        do{
          System.out.println("Valor de indice com o do while: "+indice);  
          indice++;   
        }while(indice <= 5); */
		
        do{
            System.out.println("#### MEU SOFTWARE ####");
            System.out.println("1-Descobrir se o numero e par ou impar");
            System.out.println("2-Descobrir se o numero e positivo ou negativo");
            System.out.print("Escolha uma opcao");

            opcao = leia.next();

            if (opcao.equals("1")) {
                parOuImpar();
            } else if (opcao.equals("2")) {
                positivoOuNegativo();
            } else{
                System.out.println("Opção nao encontrada");
            }
            
            System.out.println("Digite sair para finalizar ou qualquer outra tecla para continuar.");
            opcao = leia.next();
        }while(!opcao.equals("sair"));
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
