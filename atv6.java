import java.util.Scanner;
import java.util.Random;

public class atv6 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Random random = new Random();

        int numero = 0;
        String opcao[] = new String[3];
        int opcaoN[] = new int[3];

        opcaoN[0] = 0;
        opcaoN[1] = 1;
        opcaoN[2] = 2;
        opcao[0] = "Pedra";
        opcao[1] = "Papel";
        opcao[2] = "Tesoura";

        System.out.print("\nDigite 0 para iniciar o jogo: ");
        int contador = dados.nextInt();
        
        System.out.print("Caso queira sair digite -1\n");

        while(contador > -1){

            int aleatorio = random.nextInt(3);

            System.out.print("\nEscolha um numero para 0-Pedra 1-Papel 2-Tesoura: ");
            numero = dados.nextInt();
            contador = numero;

            if(contador == -1){
                System.out.println("\nFim do jogo.");
                System.out.println("Obrigado por jogar comigo.");
                break;
            }

            if(numero == 0){
                System.out.println("\nVocê escolheu Pedra");
            }

            else if(numero == 1){
                System.out.println("\nVocê escolheu Papel");
            }

            else if(numero == 2){
                System.out.println("\nVocê escolheu Tesoura");
            }


            if(aleatorio == 0){
                System.out.println("Eu escolhi Pedra");
            }

            else if(aleatorio == 1){
                System.out.println("Eu escolhi Papel");
            }

            else if(aleatorio == 2){
                System.out.println("Eu escolhi Tesoura");
            }

            if(numero == aleatorio) {
                for(int i =0; i < opcao.length; i++){
                    for (int j=0; j < opcaoN.length; j++) {
                        if (numero == opcaoN[j]) {
                            System.out.println("\n" + opcao[j] + " com " + opcao[j]);
                            System.out.println("Escolhemos as mesmas coisa, deu empate.");
                            numero = -1;
                        }
                    }
                }
            }

            else{
                if(numero > 2){
                    System.out.println("\nEssa opção não existe, tente novamente");
                }

                if(aleatorio == 0){

                    if(numero == 1){
                        System.out.println("\nPapel embrulhou a Pedra");
                        System.out.println("Você ganhou desta vez. \n");
                    }

                    else if(numero == 2){
                        System.out.println("\nPedra quebrou tesoura");
                        System.out.println("Eu ganhei de você. \n");
                    }
                }

                else if(aleatorio == 1){

                    if(numero == 0){
                        System.out.println("\nPapel embrulhou a Pedra");
                        System.out.println("Eu ganhei de você. \n");
                    }

                    else if(numero == 2){
                        System.out.println("\nTesoura cortou o Papel");
                        System.out.println("Você ganhou desta vez. \n");
                    }
                }

                else if(aleatorio == 2){

                    if(numero == 0){
                        System.out.println("\nPedra quebou Tesoura");
                        System.out.println("Você ganhou desta vez. \n");
                    }

                    else if(numero == 1){
                        System.out.println("\nTesoura cortou o papel");
                        System.out.println("Eu ganhei de você.) \n");
                    }
                }
            }
        }
        dados.close();
    }
}