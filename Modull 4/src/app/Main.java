package app ;
import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Fiksi("Atomic Habits", "James Clear");
        Buku buku2 = new NonFiksi("Psychology of Money", "Morgan Housel");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Irwand", "IF245");
        Anggota anggota2 = new Anggota("Alfino", "IF247");

        anggota1.pinjamBuku("Atomic Habits");
        anggota2.pinjamBuku("Psychology of Money", 7);
        anggota1.kembalikanBuku("Atomic Habits");
    }
}