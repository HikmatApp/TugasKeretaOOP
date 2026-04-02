class TiketEkonomi extends Tiket implements CetakTiket {

    public TiketEkonomi(String namaPenumpang, String tujuan, int harga) {
        super(namaPenumpang, tujuan, harga);
    }

    @Override
    int hitungHarga() {
        return getHarga();
    }

    @Override
    public void cetakInfo() {
        System.out.println("Tiket Ekonomi");
        System.out.println("Nama: " + getNamaPenumpang());
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + hitungHarga());
    }
}