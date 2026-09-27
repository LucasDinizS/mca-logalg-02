import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selected = 0;
        while(selected == -1){
            System.out.println("Insira o número do exercício que você quer testar (1 a 10, -1 pra sair)");
            selected = scan.nextInt();
            switch (selected) {
                case 1:
                    Ex1.Solution(scan);
                    break;
                case 2:
                    Ex2.Solution(scan);
                    break;
                case 3:
                    Ex3.Solution(scan);
                    break;
                case 4:
                    Ex4.Solution(scan);
                    break;
                case 5:
                    Ex5.Solution(scan);
                    break;
                case 6:
                    Ex6.Solution(scan);
                    break;
                case 7:
                    Ex7.Solution(scan);
                    break;
                case 8:
                    Ex8.Solution(scan);
                    break;
                case 9:
                    Ex9.Solution(scan);
                    break;
                case 10:
                    Ex10.Solution(scan);
                    break;
                default:
                    System.out.println("Número inválido");
            }
        }
    }
}