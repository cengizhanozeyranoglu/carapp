package arabaornegi;

public class Motorsiklet extends Arac {
    public Motorsiklet() {

    }

    private double trafikCezaTutari;

    public double getTrafikCezaTutari() {
        return trafikCezaTutari;
    }

    public void setTrafikCezaTutari(double trafikCezaTutari) {
        this.trafikCezaTutari = trafikCezaTutari;
    }

    public Motorsiklet(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String model, String marka, double trafikCezaTutari) {
        setId(id);
        setAracIsmi(aracIsmi);
        setRenk(renk);
        setFiyat(fiyat);
        setLastikSayisi(lastikSayisi);
        setModel(model);
        setMarka(marka);
        this.trafikCezaTutari = trafikCezaTutari;
    }

    @Override
    public void trafikCezasiOde(double cezaTutar) {
        super.trafikCezasiOde(cezaTutar);

        System.out.println(getAracIsmi() + "tipli aracın trafik cezası tutarı" + getTrafikCezaTutari());

    }

    @Override
    public void aracBilgileriGöster() {
        super.aracBilgileriGöster();
        System.out.println("ID            :           " + getId());
        System.out.println("Arac Ismi     :    " + getAracIsmi());
        System.out.println("ARAÇ RENK     :       " + getRenk());
        System.out.println("FİYAT         :      " + getFiyat());
        System.out.println("LASTİK SAYISI : " + getLastikSayisi());

    }
}
