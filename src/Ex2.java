import java.util.Scanner;

public class Ex2 {
    static public void Solution(Scanner scan) {
        System.out.println("Digite a quantia que os 3 amigos ganharam");
        double earnedAmount  = scan.nextDouble();
        double savedAmount = earnedAmount * 0.1;
        double dividedAmount = earnedAmount * 0.3;
        System.out.println("O valor guardado para limões foi de R$ "+savedAmount+"\nE cada um dos amigos ficou com R$"+dividedAmount);
    }
}
