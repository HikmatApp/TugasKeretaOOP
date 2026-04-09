import java.util.HashMap;
import java.util.Map;

class DaftarKereta {

    private Map<String, Integer> daftarKereta;

    public DaftarKereta() {

        daftarKereta = new HashMap<>();

        daftarKereta.put("Well (Ciwastra)", 150000);
        daftarKereta.put("Kopo Flash (Kopo)", 120000);
        daftarKereta.put("Coleang (Soreang)", 200000);
        daftarKereta.put("DomaGalut (Garut)", 100000);
    }

    public Map<String, Integer> getDaftarKereta() {
        return daftarKereta;
    }

    public int getHargaKereta(String namaKereta) {
        return daftarKereta.get(namaKereta);
    }
}