import Controller.clear;
import Model.JogoMain;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("pressione enter para iniciar...");
        String enter = input.nextLine();

        while (true) {
            clear.screen();
            System.out.println("Batalha Naval");
            System.out.println("\n");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Jogar modo clássico");
            System.out.println("2 - Jogar modo custom");
            System.out.println("3 - Sair");
            int opcao = input.nextInt();
            if (opcao == 1) {
                JogoMain.JogoClassico();
            } else if (opcao == 2) {
                System.out.println("Modo Custom:");
                System.out.println("Quantos Navios tipo 1 você quer colocar?");
                int n1 = input.nextInt();
                System.out.println("Quantos Navios tipo 2 você quer colocar?");
                int n2 = input.nextInt();
                System.out.println("Quantos Navios tipo 3 você quer colocar?");
                int n3 = input.nextInt();
                System.out.println("Quantos Navios tipo 4 você quer colocar?");
                int n4 = input.nextInt();
                System.out.println("Quantos Porta-Aviões você quer colocar?");
                int pt = input.nextInt();
                JogoMain.JogoCustom(n1,n2,n3,n4,pt);

            } else if (opcao == 3) {
                System.out.println("Até a próxima!");
                String end = input.nextLine();
                break;
            }
        }
    }
}
