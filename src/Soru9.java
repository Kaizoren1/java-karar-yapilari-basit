// Soru 9: Üçgen Türü Belirleme
import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenarı girin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci kenarı girin: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü kenarı girin: ");
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Bu kenarlarla üçgen oluşturulamaz.");
        } else if (a == b && b == c) {
            System.out.println("Eşkenar üçgen.");
        } else if (a == b || a == c || b == c) {
            System.out.println("İkizkenar üçgen.");
        } else {
            System.out.println("Çeşitkenar üçgen.");
        }
    }
}
