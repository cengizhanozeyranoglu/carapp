package calısanornegi;

public class Calısan {
    public int no;
    public String isim;
    public String soyisim;
    public double maas;
    public int tecrübe;


    public Calısan(int no, String isim, String soyisim, double maas, int tecrübe) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        this.tecrübe = tecrübe;
    }


    ;


    public void calısanBilgileriGöster() {
        System.out.println("*********CALISAN BİLGİLERİ*******");
        System.out.println("No : " + no);
        System.out.println("Isim : " + isim);
        System.out.println("Soyisim : " + soyisim);
        System.out.println("Maas:" + maas);
        System.out.println("Tecrübe: " + tecrübe);


    }

    public void zamYap(int zamDeğeri) {
        System.out.println("Maaşınıza " + zamDeğeri + "TL zam yapıldı");
        System.out.println("Şuanki güncel maaşınız " + (maas + zamDeğeri));
    }

    public void formatAt(String isletimSistemi, String kim) {
        System.out.println(kim + " şuanda " + isletimSistemi + "işletim sistemine format atıyor");
    }}






