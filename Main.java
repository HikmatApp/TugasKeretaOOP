public class Main {

    public static void main(String[] args) {

        TiketEkonomi ekonomi = new TiketEkonomi(
                "Hikmat",
                "Bandung",
                100000,
                "0895385486001",
                "0228"
        );

        TiketBisnis bisnis = new TiketBisnis(
                "Aprian",
                "Jakarta",
                150000,
                "0895385486145",
                "0229"
        );

        ekonomi.cetakInfo();

        System.out.println("----------------");

        bisnis.cetakInfo();
    }
}