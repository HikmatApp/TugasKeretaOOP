abstract class Tiket {

    private String namaPenumpang;
    private String tujuan;
    private int harga;

    public Tiket(String namaPenumpang, String tujuan, int harga) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getHarga() {
        return harga;
    }

    abstract int hitungHarga();
}