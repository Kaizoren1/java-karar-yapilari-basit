// Soru 1: Tek mi, Çift mi?
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayı çift.");
        } else {
            System.out.println("Sayı tek.");
        }
    }
}
