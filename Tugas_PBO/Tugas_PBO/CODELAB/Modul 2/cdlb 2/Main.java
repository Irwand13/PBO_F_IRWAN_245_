// Kelas RekeningBank
class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    RekeningBank(String nmr, String nama, double sld) {
        nomorRekening = nmr; namaPemilik = nama; saldo = sld;
    }

    void tampilkanInfo() {
        System.out.printf("Nomor Rekening: %s\nNama Pemilik: %s\nSaldo: Rp%.1f\n\n",
                nomorRekening, namaPemilik, saldo);
    }

    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.printf("%s menyetor Rp%.1f. Saldo sekarang: Rp%.1f\n\n", namaPemilik, jumlah, saldo);
    }

    void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.printf("%s menarik Rp%.1f. (Berhasil) Saldo sekarang: Rp%.1f\n\n", namaPemilik, jumlah, saldo);
        } else {
            System.out.printf("%s menarik Rp%.1f. (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp%.1f\n\n", namaPemilik, jumlah, saldo);
        }
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        RekeningBank r1 = new RekeningBank("202410370110245", "Irwand Agus", 8000000);
        RekeningBank r2 = new RekeningBank("202410370110243", "Nadhif Kuda", 7000000);

        r1.tampilkanInfo();
        r2.tampilkanInfo();

        r1.setorUang(400000);
        r2.setorUang(2000000);

        r1.tarikUang(900000);
        r2.tarikUang(400000);

        r1.tampilkanInfo();
        r2.tampilkanInfo();
    }
}
