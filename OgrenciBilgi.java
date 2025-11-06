/*
* Ad Soyad: [Selam Elali]
* Ogrenci No: [250541619]
* Tarih: [06.11.2025]
* Aciklama: Ogrenci Bilgi Sistemi 
*/

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        if (gpa >= 2.5) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Gelistirilebilir Ogrenci");
        }

        input.close();
    }
}
=== OGRENCI BILGI SISTEMI ===
Adinizi girin: selem
Soyadinizi girin: elali
Ogrenci numaraniz: 250541619
Yasiniz: 18
GPA (0.00-4.00): 3.00
=== OGRENCI BILGI SISTEMI ===
Ad Soyad: selem elali
Ogrenci No: 250541619
Yas: 18
GPA: 3.00
Durum: Basarili Ogrenci

=== Code Execution Successful ===
