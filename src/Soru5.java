// Soru 5: Not Değerlendirme
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Notu girin (0-100): ");
        int not = scanner.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not!");
        } else if (not >= 90) {
            System.out.println("Harf notu: AA");
        } else if (not >= 80) {
            System.out.println("Harf notu: BA");
        } else if (not >= 70) {
            System.out.println("Harf notu: BB");
        } else if (not >= 60) {
            System.out.println("Harf notu: CB");
        } else if (not >= 50) {
            System.out.println("Harf notu: CC");
        } else {
            System.out.println("Harf notu: FF");
        }
    }
}
