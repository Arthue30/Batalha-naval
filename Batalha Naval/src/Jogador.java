import java.util.Scanner;

public class Jogador {
    private String nickname;
    private int pontuacao;

    public String GetNickname(){
        return nickname;
    }
    public int GetPontuacao(){
        return pontuacao;
    }

    public void SetNickname(String nickname) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um nome com no máximo 15 digitos.");
        String nome = input.nextLine();
        if (nickname.length() > 0 && nickname.length() < 15) {
            this.nickname = nome;
        }
    }
    public void SetPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public Jogador(String nickname,int pontuacao){
        this.nickname = nickname;
        this.pontuacao = pontuacao;
    }
}
