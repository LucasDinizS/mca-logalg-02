import java.util.Scanner;

public class Ex3 {
    static public void Solution(Scanner scan) {
        int boughtPetFood, dailyDogConsume, restPetFood;
        System.out.println("Insira a quantidade de ração comprada (em kg)");
        boughtPetFood = scan.nextInt();
        System.out.println("Insira a quantidade diária de comida que o Scooby consome (em gramas)");
        dailyDogConsume = scan.nextInt();
        restPetFood = boughtPetFood*1000 - dailyDogConsume * 5;
        System.out.println("Após 5 dias, sobrará "+Math.max(restPetFood, 0)+"g");
    }
}
