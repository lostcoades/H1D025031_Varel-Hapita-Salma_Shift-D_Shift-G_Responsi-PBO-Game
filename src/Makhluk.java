public abstract class Makhluk {

    // maks nyawa untuk player
    public static final int MAX_HP = 100;

    private final String id;
    private String nama;
    private int health;

    public Makhluk(String id, String nama) {
        this(id, nama, MAX_HP);
    }

    public Makhluk(String id, String nama, int health) {
        this.id = id;
        this.nama = nama;
        this.health = health;
    }

    public abstract void serang(Makhluk target);

    public void terimaDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isHidup() {
        return health > 0;
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + nama + " | HP: " + health);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
}