public class Main {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("=== DEAD CITY: SURVIVAL MISSION ===");
        System.out.println("===================================");

        Survivor pemain = new Survivor("S01", "Kiko");

        System.out.println("HP maksimal: " + Makhluk.MAX_HP);
        pemain.tampilkanInfo();

        pemain.setPeluru(pemain.getPeluru() + 3);
        System.out.println("Kiko menemukan 3 peluru tambahan, total: " + pemain.getPeluru());

        Penjelajah penjelajah = pemain;
        Healable penyembuh = pemain;

        final int TARGET_PERSEDIAAN = 3;

        for (int lokasi = 1; lokasi <= 3 && pemain.isHidup(); lokasi++) {
            System.out.println("\n--- Lokasi " + lokasi + " ---");
            penjelajah.jelajah();

            Makhluk musuh = new Zombie("Z0" + lokasi);
            while (pemain.isHidup() && musuh.isHidup()) {
                pemain.serang(musuh);
                if (musuh.isHidup()) {
                    musuh.serang(pemain);
                }
                if (pemain.isHidup() && pemain.getHealth() < 40) {
                    penyembuh.pakaiObat();
                }
            }
            System.out.println("Zombie dikalahkan.");
            pemain.tampilkanInfo();
        }

        System.out.println();
        if (pemain.isHidup() && pemain.getPersediaan() >= TARGET_PERSEDIAAN) {
            System.out.println("MISI BERHASIL!");
        } else {
            System.out.println("MISI GAGAL.");
        }
    }
}