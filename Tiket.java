abstract class Tiket {

    private String nama;
    private String tujuan;
    private int harga;

    // Encapsulation
    private String noHP;
    private String kodeTiket;

    public Tiket(String nama, String tujuan, int harga, String noHP, String kodeTiket) {
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
        this.noHP = noHP;
        this.kodeTiket = kodeTiket;
    }

    public String getNama() {
        return nama;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getHarga() {
        return harga;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    abstract int hitungHarga();
}