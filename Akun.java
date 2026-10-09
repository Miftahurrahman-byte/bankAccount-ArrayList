public class Akun {
    private double saldo;
    private int nomorAkun;

    // Constructor (sesuai slide: saldo awal 0)
    public Akun(int nomorAkun) {
        saldo = 0;
        this.nomorAkun = nomorAkun;
    }

    // Menambah saldo
    public void setor(double jumlah) {
        saldo = saldo + jumlah;
    }

    // Mengurangi saldo
    public void tarik(double jumlah) {
        saldo = saldo - jumlah;
    }

    // Mengambil nomor akun
    public int getNomorAkun() {
        return nomorAkun;
    }

    // Mengambil saldo
    public double getSaldo() {
        return saldo;
    }
}