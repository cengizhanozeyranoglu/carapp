import Classlar.classlar;
import ObjectFactory.Pen;
import arabaornegi.Motorsiklet;
import objectoriented.*;
import gettesetter.kapsulleme;
import inheritance.kalıtım;
import inheritance.kalıtım2;
import arabaornegi.Arac;
import arabaornegi.Kamyon;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //      System.out.printf("Hello and welcome!");

        //    for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        //          System.out.println("i = " + i);
        //    }
        //classlar ogrenci1 = new classlar();
        //ogrenci1.isim = "Cengizhan";
        //ogrenci1.soyisim = "Özeyranoğlu";
        //ogrenci1.id = 19;
        //System.out.println(ogrenci1.isim+" "+ogrenci1.soyisim+" "+ogrenci1.id)  ;
        // Pen firstPen = new Pen();
        //firstPen.color = "Siyah" ;
        //firstPen.height = 10;
        //firstPen.marka = "faber castel";
        //firstPen.writeMessage(firstPen.marka  + "" + firstPen.color + ""+ "renginde"+ firstPen.height +"boyunda"+ "kaleminiz üretildi");
//        Car car = new Car();
//        car.NumberOfSeats = 4;
//        car.NumberOfWheels = 4;
//        Bicycle bicycle = new Bicycle();
//        bicycle.NumberOfSeats = 2;
//        bicycle.NumberOfWheels = 2;
//        Vehicle car2 = new Car();
////        car.start();
////        bicycle.start();
//        car2.stop();
//        Vehicle bicycle2 = new Bicycle();
//        bicycle2.stop();


        //Ogrenci ogrenci1 = new Ogrenci(7,"cengizhan","özeyranoğlu");
        /*System.out.println("Öğrenci bilgileri");
        System.out.println(ogrenci1.id);
        System.out.println(ogrenci1.isim);
        System.out.print(ogrenci1.soyisim);
    Ogrenci ogrenc2 = new Ogrenci();*/

//        kapsulleme kapsulleme = new kapsulleme();
//        kapsulleme.setName("Cengizhan");
//        System.out.println("Sitemize hoşgeldin" + "" + kapsulleme.getName());
//        kalıtım2 kalıtım2 = new kalıtım2();
//        kalıtım2.setAyakSayısı(4);
//        System.out.println(kalıtım2.getAyakSayısı());
//
//        kalıtım kalıtım = new kalıtım();
//        kalıtım.setAyakSayısı(66);
//        System.out.println(kalıtım.getAyakSayısı());
        //  Bir classın içersindeki değişken veya metotlara classtan nesne oluşturmadan direkt
        //class ismi üzerinden erişmemize olanak sağlayan anahtar kelimelerdir = Static
        // Static bir metot içerisinde static olmayan bir şeye ulaşamayız.
        //field static değilse nesneye özgüdür sadece o nesne ona erişip onu görebilir,
        // staticse herkes aynı neseye erişebilir
// protected yapınca metot içerisinden erişebiliyorum class içerisinden erişemiyorum.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ARAÇ UYGULAMASINA HOŞGELDİNİZ");
        System.out.println("Lütfen bir seçim yapınız");
        String giriş = "1.Kamyon\n"
                + "2.Motorsiklet";
        System.out.println(giriş);
        int secim = scanner.nextInt();
        if (secim == 1) {
            //kamyon
            int trafikCezaTutarı = 750;
            Kamyon kamyon = new Kamyon(1L, "Kamyon", "Siyah", 40000, 4, "model1", "marka1", 750);
            System.out.println("1-Kamyonun bilgilerini göster\n"
                    + "2-Trafik cezasını öde");
            int kamyonSeçim = scanner.nextInt();
            if (kamyonSeçim == 1) {
                kamyon.aracBilgileriGöster();
            } else if (kamyonSeçim == 2) {
                kamyon.trafikCezasiOde(trafikCezaTutarı);
            } else {
                System.out.println("Lütfen kamyon için geçerli bir rakam giriniz!!");
            }

        } else if (secim == 2) {
            int trafikCezasiTutarı = 750;
            Motorsiklet motorsiklet = new Motorsiklet(2L, "Motorsiklet", "Kırmızı", 500000, 2, "model2", "marka2", trafikCezasiTutarı);
            System.out.println("1-Motorsiklet bilgilerini göster\n"
                    + "2-Trafik cezasını öde");

            int motorsikletSeçim = scanner.nextInt();

            if (motorsikletSeçim == 1) {
                motorsiklet.aracBilgileriGöster();
            } else if (motorsikletSeçim == 2) {
                motorsiklet.trafikCezasiOde(trafikCezasiTutarı);


            } else {
                System.out.println("Lütfen motorsiklet için geçerli bir rakam giriniz");
            }
        } else {
            System.out.println("Lütfen belirlenen aralıkta değer girişi yapınız!!");


            //motorsiklet

            //geçersiz işlem
        }

    }


}
