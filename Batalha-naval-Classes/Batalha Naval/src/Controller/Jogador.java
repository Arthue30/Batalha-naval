package Controller;

import java.util.Scanner;

public class Jogador{
    private String nickname;

    public String GetNickname(){
        return nickname;
    }

    public String SetNickname() {                                                                                       //Método para digitar nome do jogador
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("digite um nome com no máximo 15 caracteres.");
            String nome = input.nextLine();
            if (nome.length() > 0 && nome.length() < 15) {
                nickname = nome;
                break;
            }
        }
            return (nickname);
    }

    public Jogador(){
        this.nickname=SetNickname();
        }
    }

