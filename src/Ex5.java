import java.util.Scanner;

public class Ex5 {
    static public void Solution(Scanner scan) {
        int runnedSeconds, runnedHours, runnedMinutes;
        System.out.println("Insira quantos segundos ao total você correu");
        runnedSeconds = scan.nextInt();
        runnedMinutes = runnedSeconds / 60;
        runnedSeconds = runnedSeconds % 60;
        runnedHours = runnedMinutes / 60;
        runnedMinutes =  runnedMinutes % 60;

        System.out.println("Ao total, você correu "+runnedHours+" horas, "+runnedMinutes+" minutos "+runnedSeconds+" segundos" );
    }
}
