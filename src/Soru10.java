// Soru 10: Haftanın Günü
import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-7 arası bir sayı girin: ");
        int gun = scanner.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz giriş! 1-7 arası bir sayı girin.");
        }
    }
}
