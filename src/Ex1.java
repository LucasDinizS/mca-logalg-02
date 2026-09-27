import java.util.Scanner;

public class Ex1 {
    static public void Solution(Scanner scan) {
        int healPotions, energyPotions, mana = 0;
        System.out.println("Insira o número de poções de cura preparadas");
        healPotions = scan.nextInt();
        System.out.println("Insira o número de poções de energia preparadas");
        energyPotions = scan.nextInt();
        mana = healPotions * 15 +  energyPotions * 25;
        System.out.println("O toal de mana gerado foi "+mana);
    }
}
