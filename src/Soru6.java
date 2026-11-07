// Soru 6: Artık Yıl Kontrolü
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir yıl girin: ");
        int yil = scanner.nextInt();

        if (yil <= 0) {
            System.out.println("Geçersiz yıl!");
        } else if (yil % 400 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else if (yil % 100 == 0) {
            System.out.println(yil + " artık yıl değildir.");
        } else if (yil % 4 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
