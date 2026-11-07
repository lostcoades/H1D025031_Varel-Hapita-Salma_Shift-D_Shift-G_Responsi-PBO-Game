public class Survivor extends Makhluk implements Healable, Penjelajah {

    private int peluru;
    private int obat;
    private int persediaan;

    public Survivor(String id, String nama) {
        super(id, nama, MAX_HP);
        this.peluru = 5;
        this.obat = 2;
        this.persediaan = 0;
    }

    public Survivor(String id, String nama, int peluru, int obat) {
        super(id, nama, MAX_HP);
        this.peluru = peluru;
        this.obat = obat;
        this.persediaan = 0;
    }

    @Override
    public void serang(Makhluk target) {
        if (peluru > 0) {
            peluru--;
            target.terimaDamage(40);
            System.out.println(getNama() + " menembak " + target.getNama() + " (damage 40)");
        } else {
            target.terimaDamage(10);
            System.out.println(getNama() + " memukul " + target.getNama() + " (damage 10)");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Peluru: " + peluru + " | Obat: " + obat
                + " | Persediaan: " + persediaan);
    }

    @Override
    public void pakaiObat() {
        if (obat > 0) {
            obat--;
            setHealth(Math.min(getHealth() + 30, MAX_HP));
            System.out.println(getNama() + " memakai obat, HP pulih");
        } else {
            System.out.println(getNama() + " tidak punya obat lagi");
        }
    }

    @Override
    public void jelajah() {
        if (getHealth() > 20) {
            persediaan++;
            peluru += 2;
            System.out.println(getNama() + " menemukan persediaan (+1 persediaan, +2 peluru)");
        } else {
            System.out.println(getNama() + " terlalu lemah untuk menjelajah");
        }
    }

    public int getPeluru() { return peluru; }
    public void setPeluru(int peluru) { this.peluru = peluru; }
    public int getObat() { return obat; }
    public void setObat(int obat) { this.obat = obat; }
    public int getPersediaan() { return persediaan; }
    public void setPersediaan(int persediaan) { this.persediaan = persediaan; }
}