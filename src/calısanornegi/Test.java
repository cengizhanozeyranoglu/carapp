package calısanornegi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("**********Uygulamaya hoşgeldiniz**********");
        Scanner scanner = new Scanner(System.in);

        System.out.println("No değerini giriniz");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.println("İsim değerini giriniz");
        String isim = scanner.nextLine();

        System.out.println("Soyisim değerini giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Maas değerini giriniz");
        double maas = scanner.nextDouble();

        System.out.println("Tecrübe değerini giriniz");
        int tecrübe = scanner.nextInt();
        scanner.nextLine();
        Calısan calısan1 = new Calısan(no, isim, soyisim, maas, tecrübe);

        String işlemler = "1-Çalışan bilgilerini göster\n"
                + "2-Zam yap\n"
                + "3-Format at\n";
        System.out.println("---------------");
        System.out.println(işlemler);
        System.out.println("Seçim yapınız");
        int seçim = scanner.nextInt();

        switch (seçim) {
            case 1:
                calısan1.calısanBilgileriGöster();
                break;
            case 2:
                System.out.println("Zam değerini giriniz");
                int zamDeğeri = scanner.nextInt();
                calısan1.zamYap(zamDeğeri);
                break;
            case 3:
                System.out.println("İşletim sistemini yazınız");
                String işletimSistemi = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Formatı kimin atacağını yazınız");
                String formatcı = scanner.nextLine();
                calısan1.formatAt(işletimSistemi, formatcı);
                break;


        }


    }
}
