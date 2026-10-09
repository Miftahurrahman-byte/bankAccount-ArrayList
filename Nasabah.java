import java.util.ArrayList;

public class Nasabah {
    private String namaDepan;
    private String namaBelakang;

    // ArrayList untuk menyimpan banyak akun
    private ArrayList<Akun> daftarAkun;

    // Constructor
    public Nasabah(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        daftarAkun = new ArrayList<>();
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    // Menambahkan akun ke ArrayList
    public void tambahAkun(Akun akun) {
        daftarAkun.add(akun);
    }

    // Mengambil akun berdasarkan index
    public Akun getAkun(int index) {
        return daftarAkun.get(index);
    }

    // Mengambil jumlah akun
    public int getJumlahAkun() {
        return daftarAkun.size();
    }
}