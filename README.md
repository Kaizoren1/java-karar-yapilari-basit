# Java Karar Yapıları Ödevi

Bu ödevde `if`, `else if`, `else` ve `switch` kullanarak 10 soru çözdüm. Her soru ayrı bir Java dosyasında.

## Dosyalar

| Dosya | Soru |
|-------|------|
| `src/Soru1.java` | Tek mi, Çift mi? |
| `src/Soru2.java` | Pozitif, Negatif veya Sıfır |
| `src/Soru3.java` | İki Sayının Büyüğü |
| `src/Soru4.java` | Üç Sayının En Büyüğü |
| `src/Soru5.java` | Not Değerlendirme |
| `src/Soru6.java` | Artık Yıl Kontrolü |
| `src/Soru7.java` | Bölünebilme Kontrolü |
| `src/Soru8.java` | Basit Hesap Makinesi |
| `src/Soru9.java` | Üçgen Türü Belirleme |
| `src/Soru10.java` | Haftanın Günü |

## Nasıl Çalıştırılır

```bash
cd src
javac -encoding UTF-8 *.java
java Soru1
```

`Soru1` yerine çalıştırmak istediğiniz sorunun adını yazın (ör. `java Soru5`).

## Sorular ve Testler

Her soruyu farklı girişlerle çalıştırıp sonuçları kontrol ettim.

### Soru 1 - Tek mi, Çift mi?

Sayının 2'ye bölümünden kalan 0 ise sayı çifttir, değilse tektir.

| Giriş | Çıktı |
|-------|-------|
| 4 | Sayı çift. |
| 7 | Sayı tek. |
| 0 | Sayı çift. |
| -3 | Sayı tek. |

### Soru 2 - Pozitif, Negatif veya Sıfır

Sayı 0'dan büyükse pozitif, küçükse negatif, ikisi de değilse sıfırdır.

| Giriş | Çıktı |
|-------|-------|
| 15 | Sayı pozitif. |
| -8 | Sayı negatif. |
| 0 | Sayı sıfır. |

### Soru 3 - İki Sayının Büyüğü

İki sayıyı karşılaştırdım. Sayılar eşitse "Sayılar eşit." yazıyor.

| Giriş | Çıktı |
|-------|-------|
| 10, 3 | Büyük olan sayı: 10 |
| -5, 2 | Büyük olan sayı: 2 |
| 7, 7 | Sayılar eşit. |

### Soru 4 - Üç Sayının En Büyüğü

Önce üç sayının eşit olup olmadığına baktım. Değilse en büyük sayıyı buldum.

| Giriş | Çıktı |
|-------|-------|
| 3, 9, 5 | En büyük sayı: 9 |
| 8, 8, 2 | En büyük sayı: 8 |
| 4, 4, 4 | Üç sayı da eşit. |

### Soru 5 - Not Değerlendirme

0'dan küçük veya 100'den büyük not geçersizdir. Diğer notlar şu şekilde:
90-100: AA, 80-89: BA, 70-79: BB, 60-69: CB, 50-59: CC, 0-49: FF

| Giriş | Çıktı |
|-------|-------|
| 95 | Harf notu: AA |
| 90 | Harf notu: AA |
| 89 | Harf notu: BA |
| 72 | Harf notu: BB |
| 55 | Harf notu: CC |
| 0 | Harf notu: FF |
| 101 | Geçersiz not! |
| -5 | Geçersiz not! |

### Soru 6 - Artık Yıl Kontrolü

- 400'e bölünen yıl artık yıldır.
- 100'e bölünüp 400'e bölünmeyen yıl artık yıl değildir.
- 4'e bölünen yıl artık yıldır.
- 0 veya negatif yıl geçersizdir.

| Giriş | Çıktı |
|-------|-------|
| 2024 | 2024 artık yıldır. |
| 2023 | 2023 artık yıl değildir. |
| 1900 | 1900 artık yıl değildir. |
| 2000 | 2000 artık yıldır. |
| 0 | Geçersiz yıl! |

### Soru 7 - Bölünebilme Kontrolü

Önce hem 3'e hem 5'e bölünmeyi kontrol ettim, sonra tek tek 3'e ve 5'e.

| Giriş | Çıktı |
|-------|-------|
| 15 | Sayı hem 3'e hem 5'e bölünür. |
| 9 | Sayı sadece 3'e bölünür. |
| 10 | Sayı sadece 5'e bölünür. |
| 7 | Sayı ne 3'e ne 5'e bölünür. |

### Soru 8 - Basit Hesap Makinesi

İki sayı ve bir işlem alıp `switch` ile hesapladım. Sıfıra bölmeyi ve yanlış işlem girişini kontrol ettim.

| Giriş | Çıktı |
|-------|-------|
| 6, 4, + | Sonuç: 10.0 |
| 6, 4, - | Sonuç: 2.0 |
| 6, 4, * | Sonuç: 24.0 |
| 6, 4, / | Sonuç: 1.5 |
| 5, 0, / | Sıfıra bölme yapılamaz! |
| 5, 2, % | Geçersiz işlem! |

### Soru 9 - Üçgen Türü Belirleme

Üçgen olması için her iki kenarın toplamı üçüncü kenardan büyük olmalı. Üçgen olursa:
- Üç kenar eşitse eşkenar
- İki kenar eşitse ikizkenar
- Hiçbiri eşit değilse çeşitkenar

| Giriş | Çıktı |
|-------|-------|
| 5, 5, 5 | Eşkenar üçgen. |
| 5, 5, 8 | İkizkenar üçgen. |
| 3, 4, 5 | Çeşitkenar üçgen. |
| 1, 2, 3 | Bu kenarlarla üçgen oluşturulamaz. |
| 0, 4, 5 | Bu kenarlarla üçgen oluşturulamaz. |

### Soru 10 - Haftanın Günü

1-7 arası sayıyı `switch` ile güne çevirdim. Başka bir sayı girilirse `default` kısmı çalışır.

| Giriş | Çıktı |
|-------|-------|
| 1 | Pazartesi |
| 3 | Çarşamba |
| 7 | Pazar |
| 0 | Geçersiz giriş! 1-7 arası bir sayı girin. |
| 8 | Geçersiz giriş! 1-7 arası bir sayı girin. |
