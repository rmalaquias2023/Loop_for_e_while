import java.util.Random;
import java.util.Scanner;

public class advinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int numeroEscolhido;
        int tentativas =0;

        while (tentativas < 5) {
            System.out.println("Digite um numero de 0 a 100: ");
            numeroEscolhido = leitura.nextInt();
            tentativas++;

            if (numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns!! Você acertou na mosca. O numero sorteado foi:  " + numeroSorteado);
                break;
            } else if (numeroEscolhido < numeroSorteado){
                System.out.println("Que pena, você errou!O nº que você escolheu é menor que o sorteado. Não desista");

            } else if (numeroEscolhido > numeroSorteado){
                System.out.println("Que pena, você errou!O nº que você escolheu é maior que o sorteado. Não desista");

            }
        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroSorteado);
        }

    }


}