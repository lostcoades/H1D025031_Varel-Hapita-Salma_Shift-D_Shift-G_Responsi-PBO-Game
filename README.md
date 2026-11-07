Nama : Varel Hapita Salma
NIM : H1D025031
Tema : Game (berakhiran 1)

## Responsi Akhir Praktikum Pemrograman Berorientasi Objek

Nama Game : Dead City: Survival Mission

## Deskripsi Singkat
Sebuah game dengan berbasis teks saja di terminal. Berisikan alur pemain yang menjelajahi ke tiga lokasi di kota yang dipenihi zombie untuk mencari sisa persediaan hingga harus melawan zombie di tiap lokasi. Misi berhasil jika pemain masih hidup dan berhasil mengumpulkan minimal 3 persediaan.

## Struktur Kelas
1. Makhluk = Superclass abstract (atribut dasar, abstract method serang()).
2. Survivor = Subclass: pemain, mengimplementasikan Healable dan Penjelajah.
3. Zombie = Subclass: musuh dengan aturan serangan sendiri.
4. Healable = Interface: pakaiObat().
5. Penjelajah = Interface: jelajah().
6. Main = Alur pengujian dan jalannya misi.

## Alur Program
1. Buat objek pemain dengan 'Survivor pemain = new Survivor("S01", "Kiko")' membuat 'Kiko (HP 100, peluru 5, obat 2)'.
2. Tampilkan info awal lewat 'pemain.tampilkanInfo()'.
3. Tambah peluru lewat 'setPeluru()' dan 'getPeluru()' maka peluru jadi 8.
4. Hubungkan ke interface 'Penjelajah penjelajah = pemain' dan 'Healable penyembuh = pemain', supaya Kiko bisa dipanggil lewat interface.
5. Loop terdapat 3 lokasi. Di tiap lokasi:
    - Menjelajah, lewat 'penjelajah.jelajah()', persediaan +1 dan peluru +2.
    - Buat zombie: 'Makhluk musuh = new Zombie(...)'.
    - Bertarung bergiliran, selama keduanya hidup:
      - Kiko menyerang lewat 'pemain.serang(musuh)'.
      - Zombie membalas lewat 'musuh.serang(pemain)'.
      - Kalau HP KIko sudah di bawah 40, Kiko memakai obat lewat 'penyembuh.pakaiObat()'.
  d. Ketika Zombie akhirnya mati, info Kiko ditampilkan lewat 'pemain.tampilkanInfo()'.
7. Cek hasilnya dengan melalui 'pemain.isHidup()' dan 'pemain.getPersediaan()'. Kalau Kiko hidup dan persediaannya minimal 3, akan menampilkan output “MISI BERHASIL!”. Sedangkan kalau tidak, “MISI GAGAL.”

## Cara Compile dan Run (Terminal)
   ```bash
   javac *.java
   java Main
   ```

## Screenshot Luaran Program
<img width="892" height="900" alt="output_1" src="https://github.com/user-attachments/assets/dde1113d-7a49-4eb4-acd6-9f2621cd6efc" />
<img width="902" height="742" alt="output_2" src="https://github.com/user-attachments/assets/dfa8b060-4795-4d6b-8fc4-2dc28c5ea55c" />


