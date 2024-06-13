package inheritance;

public class kalıtım {
    private Long id;
    private String hayvanIsmi;
    private int yas;
    private String renk;
    private int ayakSayısı;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHayvanIsmi() {
        return hayvanIsmi;
    }

    public void setHayvanIsmi(String hayvanIsmi) {
        this.hayvanIsmi = hayvanIsmi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;


    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAyakSayısı() {
        return ayakSayısı;
    }

    public void setAyakSayısı(int ayakSayısı) {
        this.ayakSayısı = ayakSayısı;
    }
}
