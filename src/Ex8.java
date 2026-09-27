import java.util.Scanner;

public class Ex8 {
    static public void Solution(Scanner scan) {
        int amount10cents, amount25cents, amount50cents;
        double savedAmount = 0;
        System.out.println("Insira o valor de moedas de 10 centavos guardados");
        amount10cents = scan.nextInt();
        System.out.println("Insira o valor de moedas de 25 centavos");
        amount25cents = scan.nextInt();
        System.out.println("Insira o valor de moedas de 50 centavos");
        amount50cents = scan.nextInt();

        savedAmount = amount10cents * 0.10 +  amount25cents * 0.25 + amount50cents * 0.50;

        System.out.println("O valor poupado no total foi de R$"+savedAmount);
    }
}
