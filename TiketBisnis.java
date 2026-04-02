class TiketBisnis extends Tiket implements CetakTiket {

    public TiketBisnis(String nama, String tujuan, int harga, String noHP, String kodeTiket) {
        super(nama, tujuan, harga, noHP, kodeTiket);
    }

    int hitungHarga() {
        return getHarga() + 50000;
    }

    public void cetakInfo() {
        System.out.println("Tiket Bisnis");
        System.out.println("Nama: " + getNama());
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + hitungHarga());
    }
}