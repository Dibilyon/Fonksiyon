import java.util.Scanner;

public class Fonksiyon {
    public static int ortalamaHesapla() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk notu giriniz:");
        int not1 = scanner.nextInt();
        System.out.println("Lütfen ikinci notu giriniz:");
        int not2 = scanner.nextInt();
        System.out.println("Lütfen üçüncü notu giriniz:");
        int not3 = scanner.nextInt();
        int ortalama = (not1 + not2 + not3) / 3;
        return ortalama;
    }

    public static void main(String[] args) {
        String message = "Kura çekimine hoşgeldiniz.\n" +
                "Üç dersin not ortalaması en yüksek olan öğrenci Playstation 5\n" +
                "En yüksek ikinci olan öğrenci telefon\n" +
                "En yüksek üçüncü olan öğrenci mouse\n"+
                "En yüksek dördüncü öğrenci ise tebrik edilecektir";
        System.out.println(message);

        int ogrenci1 = ortalamaHesapla();
        int ogrenci2 = ortalamaHesapla();
        int ogrenci3 = ortalamaHesapla();
        int ogrenci4 = ortalamaHesapla();
        System.out.println("Öğrenci1 Ders Notu Ortalaması: " + ogrenci1);
        System.out.println("Öğrenci2 Ders Notu Ortalaması: " + ogrenci2);
        System.out.println("Öğrenci3 Ders Notu Ortalaması: " + ogrenci3);
        System.out.println("Öğrenci4 Ders Notu Ortalaması: " + ogrenci4);

        if ((ogrenci1 > ogrenci2) && (ogrenci1 > ogrenci3) && (ogrenci1 > ogrenci4))
            System.out.println("En yüksek ortalamaya sahip kişi öğrenci1'dir.");
        else if ((ogrenci2 > ogrenci1) && (ogrenci2 > ogrenci3) && (ogrenci2 > ogrenci4))
            System.out.println("En yüksek ortalamaya sahip kişi öğrenci2'dir.");
        else if ((ogrenci3 > ogrenci1) && (ogrenci3 > ogrenci2) && (ogrenci3 > ogrenci4))
            System.out.println("En yüksek ortalamaya sahip kişi öğrenci3'tür.");
        else if ((ogrenci4 > ogrenci1) && (ogrenci4 > ogrenci2) && (ogrenci4 > ogrenci3))
            System.out.println("En yüksek ortalamaya sahip kişi öğrenci4'tür.");
        else {
        }
        int [] b = {ogrenci1, ogrenci2, ogrenci3, ogrenci4};
        int sıralama;

        for (int i = 0; i < 4; i++)
        {
            for (int j = i + 1; j < 4; j++) {
                if (b[i] > b[j])
        {
                    sıralama = b[i];
                    b[i] = b[j];
                    b[j] = sıralama;
        }
        }
        }
        System.out.print("Öğrencilerin Başarı Sıralaması: ");
        for (int i = 0; i < 4; i++)
        {
            if (i == 3){
                System.out.print("1.olan öğrenci: ");
                System.out.print(b[i] + ", ");
            }
            if (i == 0) {
                System.out.print("4.olan öğrenci: ");
                System.out.print(b[i] + ", ");
            }
            if (i == 1){
                System.out.print("3.olan öğrenci: ");
                System.out.print(b[i] + ", ");
            }
            if (i == 2){
                System.out.print("2.olan öğrenci: ");
                System.out.print(b[i] + ", ");
            }
}
}
}

