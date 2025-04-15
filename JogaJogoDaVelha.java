import java.util.Scanner;

public class JogaJogoDaVelha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean jogarAgain = true;
        
            while (jogarAgain) {
            System.out.println("Bem-vindo ao Jogo da Velha!");
            System.out.println("Escolha o tamanho do tabuleiro: ");
            int dimensao = sc.nextInt();
            }

            JogoDaVelha jogonovo = new JogoDaVelha(dimensao); 
            int acabou = jogonovo.poePecaAutomatico();
            
            while (acabou == 2) {
                System.out.println(jogonovo.toString());
                System.out.println("Vez do jogador " + (jogonovo.getJogador() == 1 ? "X" : "O"));
                System.out.println("\n");
                acabou = jogonovo.poePecaAutomatico();
            }
            
            System.out.println(jogonovo.toString());
            
            if (acabou == 1) {
                System.out.println("Jogador X venceu!");
            } else if (acabou == -1) {
                System.out.println("Jogador O venceu!");
            } else if (acabou == 0) {
                System.out.println("Empate!");
            }
            
            int resposta = -1;
            do {
                System.out.println("Deseja jogar novamente? (1-Sim/0-Não): ");
                try {
                    resposta = sc.nextInt();
                    if (resposta != 0 && resposta != 1) {
                        System.out.println("Opção inválida. Digite 1 para Sim ou 0 para Não.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Digite apenas 0 ou 1.");
                    sc.nextLine(); 
                }
            } while (resposta != 0 && resposta != 1);
            
            jogarAgain = (resposta == 1);
        };
        
        System.out.println ("Obrigado por jogar!");

        sc.close();
    }
