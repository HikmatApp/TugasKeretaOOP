class TiketBisnis extends Tiket implements CetakTiket {

    public TiketBisnis(String namaPenumpang, String tujuan, int harga) {
        super(namaPenumpang, tujuan, harga);
    }

    @Override
    int hitungHarga() {
        return getHarga() + 50000;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Tiket Bisnis");
        System.out.println("Nama: " + getNamaPenumpang());
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + hitungHarga());
    }
}