// Kelas Hewan
class Hewan {
    String nama, jenis, suara;

    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo() {
        System.out.printf("Nama: %s\nJenis: %s\nSuara: %s\n\n", nama, jenis, suara);
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        new Hewan("Kucing", "Mamalia", "Miaw~").tampilkanInfo();
        new Hewan("Anjing", "Mamalia", "Woof-Woof!!").tampilkanInfo();
    }
}
