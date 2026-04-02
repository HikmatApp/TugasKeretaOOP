public class Main {

    public static void main(String[] args) {

        TiketEkonomi ekonomi = new TiketEkonomi(
                "Hikmat",
                "Bandung",
                100000
        );

        TiketBisnis bisnis = new TiketBisnis(
                "Aprian",
                "Jakarta",
                150000
        );

        ekonomi.cetakInfo();

        System.out.println("----------------");

        bisnis.cetakInfo();
    }
}