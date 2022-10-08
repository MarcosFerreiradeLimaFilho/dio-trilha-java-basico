package projeto;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        Scanner sc = new Scanner(System.in);

        System.out.println("O que você deseja fazer ?");
        System.out.println("1 - ligar Tv.");
        System.out.println("2 - Manter Tv desligada.");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                smartTv.ligar();
                System.out.println("Tv ligada");
                break;
            
            case 2:
            System.out.println("Tv ainda desligada");
            break;
        
            default:
                System.out.println("Opção invalida");
                break;
        }
        
        System.out.println("O que gostaria de fazer agora?");
        System.out.println("1 - escolher canal.");
        System.out.println("2- passar canal.");
        System.out.println("3- diminuir canal");
        System.out.println("4- aumentar volume.");
        System.out.println("5- diminuir volume.");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
            System.out.println("Qual o canal?");
            smartTv.mudarCanal(sc.nextInt());
                break;

            case 2:  
            smartTv.aumentarCanal();
                break;

            case 3:
            smartTv.diminuirCanal(); 
                break;

            case 4:
            smartTv.aumentarVolume();
                break;
                
            case 5:
            smartTv.diminuirVolume();  
                break;
        
            default:

            System.out.println("Opção invalida.");
                break;
        }
    }
}