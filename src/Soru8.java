// Soru 8: Basit Hesap Makinesi
import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlem girin (+, -, *, /): ");
        String islem = scanner.next();

        switch (islem) {
            case "+":
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            case "/":
                if (sayi2 == 0) {
                    System.out.println("Sıfıra bölme yapılamaz!");
                } else {
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
        }
    }
}
