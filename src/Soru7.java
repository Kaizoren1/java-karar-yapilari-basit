// Soru 7: Bölünebilme Kontrolü
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Sayı hem 3'e hem 5'e bölünür.");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayı sadece 3'e bölünür.");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayı sadece 5'e bölünür.");
        } else {
            System.out.println("Sayı ne 3'e ne 5'e bölünür.");
        }
    }
}
