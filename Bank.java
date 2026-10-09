import java.util.ArrayList;

public class Bank {
    // ArrayList untuk menyimpan banyak nasabah
    private ArrayList<Nasabah> daftarNasabah;

    // Constructor
    public Bank() {
        daftarNasabah = new ArrayList<>();
    }

    // Menambahkan nasabah
    public void tambahNasabah(String namaDepan, String namaBelakang) {
        daftarNasabah.add(new Nasabah(namaDepan, namaBelakang));
    }

    // Mengambil jumlah nasabah
    public int getJumlahNasabah() {
        return daftarNasabah.size();
    }

    // Mengambil nasabah berdasarkan index
    public Nasabah getNasabah(int index) {
        return daftarNasabah.get(index);
    }
}