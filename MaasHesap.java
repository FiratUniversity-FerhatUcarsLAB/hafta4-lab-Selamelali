/*
* Ad Soyad: [Selem El Ali]
* Ogrenci No: [250541619]
* Tarih: [06.11.2025]
* Aciklama: Maas Hesaplama Sistemi
*/

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");

        System.out.print("Calisan ad soyad: ");
        input.nextLine(); // Scanner bug fix
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas             : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat): %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR           : %.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)     : %.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%)     : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)     : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI         : %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAS               : %.2f TL%n", netMaas);
        System.out.println("====================================");

        System.out.printf("Kesinti Orani: %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc: %.2f TL%n", gunlukNetKazanc);

        input.close();
    }
}
====================================
MAAS BORDROSU
====================================
Calisan ad soyad: selem elali

Aylik brut maas (TL): 30000
Haftalik calisma saati: 30
Mesai saati sayisi: 10
Calisan: 
GELIRLER:
Brut Maas             : 30000.00 TL
Mesai Ucreti (10 saat): 2812.50 TL
------------------------
TOPLAM GELIR           : 32812.50 TL
KESINTILER:
SGK Kesintisi (14.0%)     : 4593.75 TL
Gelir Vergisi (15.0%)     : 4921.88 TL
Damga Vergisi (0.8%)     : 249.05 TL
------------------------
TOPLAM KESINTI         : 9764.67 TL
NET MAAS               : 23047.83 TL
====================================
Kesinti Orani: 29.8%
Saatlik Net Kazanc: 130.95 TL
Gunluk Net Kazanc: 1047.63 TL

=== Code Execution Successful ===
