// Soru 3: İki Sayının Büyüğü
import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Büyük olan sayı: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük olan sayı: " + sayi2);
        } else {
            System.out.println("Sayılar eşit.");
        }
    }
}
