import java.util.Scanner;

public class Ex7 {
    static public void Solution(Scanner scan) {
        double height,  width, area,litersAmount;
        System.out.println("Insira a altura (em metros) da parede");
        height = scan.nextDouble();
        System.out.println("Insira a largura (em metros) da parede");
        width = scan.nextDouble();

        area = height * width;

        litersAmount = area/3;

        System.out.println("A parede tem um total de "+area+" metros quadrados e você vai precisar de "+litersAmount+" litros para pintá-la");
    }
}
