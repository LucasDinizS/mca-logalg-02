import java.util.Scanner;

public class Ex9
{
    static public void Solution(Scanner scan) {
        double runnedDistance, timeSpent, averageSpeed;
        System.out.println("Digite a quantidade percorrida (em km)");
        runnedDistance = scan.nextDouble();
        System.out.println("Digite o tempo gasto (em minutos)");
        timeSpent = scan.nextDouble();

        averageSpeed = runnedDistance / timeSpent * 60;
        System.out.println("A velocidade média na corrida foi de "+averageSpeed+"km/h");
    }
}
