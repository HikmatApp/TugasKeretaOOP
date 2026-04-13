import java.util.*;

public class Main {

    public static void main(String[] args) {
try {
        Scanner input = new Scanner(System.in);

        DaftarKereta daftar = new DaftarKereta();

        Map<String, Integer> dataKereta = daftar.getDaftarKereta();

        System.out.println("===== DAFTAR KERETA =====");

        int nomor = 1;

        List<String> listKereta = new ArrayList<>(dataKereta.keySet());

        for (String kereta : listKereta) {
            System.out.println(nomor + ". " + kereta + " - " + dataKereta.get(kereta));
            nomor++;
        }
int pilihan = 0;
            try {
                System.out.print("Pilih Kereta (nomor): ");
                pilihan = input.nextInt();  // DIUBAH
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                return;
            }
            String namaKereta;
            try {
                namaKereta = listKereta.get(pilihan - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Pilihan tidak tersedia!");
                return;
            }

        int harga = dataKereta.get(namaKereta);

        System.out.print("Nama Penumpang: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String noHP = input.nextLine();

        System.out.print("Kode Tiket: ");
        String kode = input.nextLine();

        System.out.println("Pilih Jenis Tiket");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");

        int jenis = 0;  // DIUBAH
            try {
                jenis = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                return;
            }

        Tiket tiket;

        if (jenis == 1) {
                tiket = new TiketEkonomi(nama, namaKereta, harga, noHP, kode);
            } else if (jenis == 2) {
                tiket = new TiketBisnis(nama, namaKereta, harga, noHP, kode);
            } else {
                System.out.println("Jenis tiket tidak valid!");
                return;
            }

        System.out.println("\n===== TIKET =====");

        ((CetakTiket) tiket).cetakInfo();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}