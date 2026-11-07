public class Zombie extends Makhluk {

    private int amarah;

    public Zombie(String id) {
        super(id, "Zombie", 100);
        this.amarah = 0;
    }

    @Override
    public void serang(Makhluk target) {
        if (amarah >= 2) {
            target.terimaDamage(25);
            amarah = 0;
            System.out.println(getNama() + " mengamuk dan mencakar " + target.getNama() + " (damage 25)");
        } else {
            target.terimaDamage(10);
            amarah++;
            System.out.println(getNama() + " menggigit " + target.getNama() + " (damage 10)");
        }
    }

    public int getAmarah() { return amarah; }
    public void setAmarah(int amarah) { this.amarah = amarah; }
}