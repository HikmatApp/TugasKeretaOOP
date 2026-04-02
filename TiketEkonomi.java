class TiketEkonomi extends Tiket implements CetakTiket {

    public TiketEkonomi(String nama, String tujuan, int harga, String noHP, String kodeTiket) {
        super(nama, tujuan, harga, noHP, kodeTiket);
    }

    int hitungHarga() {
        return getHarga();
    }

    public void cetakInfo() {
        System.out.println("Tiket Ekonomi");
        System.out.println("Nama: " + getNama());
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + hitungHarga());
    }
}