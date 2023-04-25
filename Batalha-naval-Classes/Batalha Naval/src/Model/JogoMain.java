package Model;

import Controller.Jogador;
import Controller.clear;
import Model.Tabuleiro;

import java.util.Scanner;

public class JogoMain {

    public static void JogoClassico(){
        //model(objetos),controller(logica)

        clear.screen();
        System.out.println("Primeiro jogador:");
        Jogador player1= new Jogador();

        clear.screen();
        System.out.println("Segundo jogador:");
        Jogador player2= new Jogador();

        Tabuleiro player1Ataque = new Tabuleiro();
        Tabuleiro player1Defesa = new Tabuleiro();
        Tabuleiro player2Ataque = new Tabuleiro();
        Tabuleiro player2Defesa = new Tabuleiro();

        clear.screen();
        System.out.println(player1.GetNickname()+",sua vez:\n");
        player1Defesa.printaTabuleiros();
        player1Defesa.posicionaNavios(player1Defesa,player1Defesa.getNavio1(),player1Defesa.getNavio2(),player1Defesa.getNavio3(),player1Defesa.getNavio4(),player1Defesa.getPortaAvioes());

        clear.screen();
        System.out.println(player2.GetNickname()+",sua vez:\n");
        player2Defesa.printaTabuleiros();
        player2Defesa.posicionaNavios(player2Defesa,player2Defesa.getNavio1(),player2Defesa.getNavio2(),player2Defesa.getNavio3(),player2Defesa.getNavio4(),player2Defesa.getPortaAvioes());

        while(true) {
            Scanner input = new Scanner(System.in);
            if(player1Defesa.contaAcerto(player1Defesa)==player1Defesa.contaNavios()){
                System.out.println("\nParabéns, "+player2.GetNickname()+", você venceu!");
                String enter = input.nextLine();
                break;
            }
            else if(player2Defesa.contaAcerto(player2Defesa)==player2Defesa.contaNavios()){
                System.out.println("\nParabéns, "+player1.GetNickname()+", você venceu!");
                String enter = input.nextLine();
                break;
            }

            clear.screen();
            System.out.println(player1.GetNickname()+",sua vez:\n");
            player1Ataque.atacar(player2Defesa);
            System.out.println("enter para passar o turno");
            String enter = input.nextLine();
            clear.screen();
            System.out.println(player2.GetNickname()+",sua vez:\n");
            player2Ataque.atacar(player1Defesa);
            System.out.println("enter para passar o turno");
            String enter2 = input.nextLine();
            clear.screen();
        }
    }

    public static void JogoCustom(int navio1, int navio2, int navio3, int navio4, int portaAvioes){

        clear.screen();
        System.out.println("Primeiro jogador:");
        Jogador player1= new Jogador();

        clear.screen();
        System.out.println("Segundo jogador:");
        Jogador player2= new Jogador();

        Tabuleiro player1Ataque = new Tabuleiro();
        Tabuleiro player1Defesa = new Tabuleiro();
        Tabuleiro player2Ataque = new Tabuleiro();
        Tabuleiro player2Defesa = new Tabuleiro();

        clear.screen();
        System.out.println(player1.GetNickname()+",sua vez:\n");
        player1Defesa.printaTabuleiros();
        player1Defesa.posicionaNavios(player1Defesa,navio1,navio2,navio3,navio4,portaAvioes);

        clear.screen();
        System.out.println(player2.GetNickname()+",sua vez:\n");
        player2Defesa.printaTabuleiros();
        player2Defesa.posicionaNavios(player2Defesa,navio1,navio2,navio3,navio4,portaAvioes);

        while(true) {
            Scanner input = new Scanner(System.in);
            if(player1Defesa.contaAcerto(player1Defesa)==(navio1*1)+(navio2*2)+(navio3*3)+(navio4*4)+(portaAvioes*5)){
                System.out.println("\nParabéns, "+player2.GetNickname()+", você venceu!");
                String enter = input.nextLine();
                break;
            }
            else if(player2Defesa.contaAcerto(player2Defesa)==(navio1*1)+(navio2*2)+(navio3*3)+(navio4*4)+(portaAvioes*5)){
                System.out.println("\nParabéns, "+player1.GetNickname()+", você venceu!");
                String enter = input.nextLine();
                break;
            }

            clear.screen();
            System.out.println(player1.GetNickname()+",sua vez:\n");
            player1Ataque.atacar(player2Defesa);
            System.out.println("enter para passar o turno");
            String enter = input.nextLine();
            clear.screen();
            System.out.println(player2.GetNickname()+",sua vez:\n");
            player2Ataque.atacar(player1Defesa);
            System.out.println("enter para passar o turno");
            String enter2 = input.nextLine();
            clear.screen();
        }
    }
}