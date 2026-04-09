import java.util.*;

public class Main {

    public static void main(String[] args) {

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

        System.out.print("Pilih Kereta (nomor): ");
        int pilihan = input.nextInt();
        input.nextLine();

        String namaKereta = listKereta.get(pilihan - 1);

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

        int jenis = input.nextInt();

        Tiket tiket;

        if (jenis == 1) {
            tiket = new TiketEkonomi(nama, namaKereta, harga, noHP, kode);
        } else {
            tiket = new TiketBisnis(nama, namaKereta, harga, noHP, kode);
        }

        System.out.println("\n===== TIKET =====");

        ((CetakTiket) tiket).cetakInfo();
    }
}