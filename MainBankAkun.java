public class MainBankAkun {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Menambahkan nasabah
        bank.tambahNasabah("Miftahurrahman", "Oppan");
        bank.tambahNasabah("Muhammad", "Arvin");
        bank.tambahNasabah("Lalu Hajiril", "Akbar");

        // Membuat akun (saldo awal 0)
        Akun akun1 = new Akun(101);
        Akun akun2 = new Akun(102);
        Akun akun3 = new Akun(103);
        Akun akun4 = new Akun(104);

        // Mengisi saldo awal lewat setor
        akun1.setor(1000000);
        akun2.setor(2000000);
        akun3.setor(3000000);
        akun4.setor(4000000);

        // Menambahkan akun ke nasabah pertama
        bank.getNasabah(0).tambahAkun(akun1);
        bank.getNasabah(0).tambahAkun(akun2);
        bank.getNasabah(0).tambahAkun(akun3);

        // Menambahkan akun ke nasabah kedua
        bank.getNasabah(1).tambahAkun(akun4);

        // Demo setor dan tarik
        akun1.setor(500000);
        akun2.tarik(250000);

        System.out.println("JUMLAH NASABAH: " + bank.getJumlahNasabah());

        // Perulangan untuk setiap nasabah
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);

            System.out.println("\nNasabah ke-" + (i + 1));
            System.out.println("Nama: " + nasabah.getNamaDepan() + " "
                    + nasabah.getNamaBelakang());
            System.out.println("Jumlah akun: " + nasabah.getJumlahAkun());

            // Perulangan untuk setiap akun milik nasabah
            for (int j = 0; j < nasabah.getJumlahAkun(); j++) {
                Akun akun = nasabah.getAkun(j);
                System.out.println("Nomor akun: " + akun.getNomorAkun()
                        + " | Saldo: Rp" + akun.getSaldo());
            }
        }
    }
}