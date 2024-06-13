package arabaornegi;

public class Kamyon extends Arac {
    private double trafikCezaları;

    public Kamyon() {

    }

    public Kamyon(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String model, String marka, double trafikCezaları) {
        setId(id);
        setAracIsmi(aracIsmi);
        setRenk(renk);
        setFiyat(fiyat);
        setLastikSayisi(lastikSayisi);
        setModel(model);
        setMarka(marka);
        this.trafikCezaları = trafikCezaları;


    }

    public double getTrafikCezaları() {
        return trafikCezaları;
    }

    public void setTrafikCezaları(double trafikCezaları) {
        this.trafikCezaları = trafikCezaları;
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

    @Override
    public void trafikCezasiOde(double cezaTutar) {
        super.trafikCezasiOde(cezaTutar);
        System.out.println(getAracIsmi() + "tipli aracın trafik cezası tutarı" + getTrafikCezaları());

    }
}
