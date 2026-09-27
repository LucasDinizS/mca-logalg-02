import java.util.Scanner;

public class Ex6 {
    static public void Solution(Scanner scan) {
        int producedAmount;
        double phoneCasePrice, eachProductionCost = 5.8, totalProductionCost, liquidNetAmount;

        System.out.println("Insira o preço que você cobra em cada capinha");
        phoneCasePrice = scan.nextDouble();
        System.out.println("Insira a quantidade de capinhas produzidas");
        producedAmount = scan.nextInt();

        totalProductionCost = producedAmount * eachProductionCost;
        liquidNetAmount = phoneCasePrice * producedAmount - totalProductionCost;
        System.out.println("Você gastou ao todo R$"+totalProductionCost+" de produção e lucrou o valor líquido de R$"+liquidNetAmount);
    }
}
