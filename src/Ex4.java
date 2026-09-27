import java.util.Scanner;

public class Ex4 {
    static public void Solution(Scanner scan) {
        int solarPanels;
        double kWhCost, kWhGenerated, savedAmount;
        System.out.println("Quantos paineis solares você tem instalado");
        solarPanels = scan.nextInt();
        System.out.println("Qual o preço cobrado por kWh (em reais)");
        kWhCost = scan.nextDouble();

        kWhGenerated = solarPanels * 30 * 1.20;
        savedAmount = kWhCost * kWhGenerated;

        System.out.println("Os painéis gerarão "+kWhGenerated+"kWh em 30 dias, e o dono economizará R$"+savedAmount);
    }
}
