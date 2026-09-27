import java.util.Scanner;

public class Ex10 {
    static public void Solution(Scanner scan) {
        int foundCoins, explorersAmount, donatedCoins, eachReceivedAmount;
        System.out.println("Insira o número de moedas encontradas");
        foundCoins = scan.nextInt();
        System.out.println("Insira o número de membros a ser dividido");
        explorersAmount = scan.nextInt();

        eachReceivedAmount = foundCoins /  explorersAmount;
        donatedCoins =  foundCoins % explorersAmount;

        System.out.println("O número de moedas doadas ao lider foi de "+donatedCoins+" e o número recebido de moedas para cada membro foi de "+eachReceivedAmount);
    }
}
