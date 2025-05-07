import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data untuk login
        Admin admin = new Admin("KangMas Raden Gus Irwan", "245", "admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Irwanda", "202310370110245");

        System.out.println("===== LOGIN SYSTEM =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = sc.nextInt();
        sc.nextLine(); // Membersihkan newline

        boolean sukses = false;

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String user = sc.nextLine();
            System.out.print("Masukkan password: ");
            String pass = sc.nextLine();

            sukses = admin.login(user, pass);
            if (sukses) {
                admin.displayInfo();
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            sukses = mahasiswa.login(nama, nim);
            if (sukses) {
                mahasiswa.displayInfo();
            }

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        if (!sukses) {
            System.out.println("\nLogin gagal. Coba lagi ya!");
        }

        sc.close();
    }
}
