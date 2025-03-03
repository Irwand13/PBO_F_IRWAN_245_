import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                String nimTerakhir = "245";
                String validUsername = "Admin" + nimTerakhir;
                String validPassword = "password" + nimTerakhir;

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                String validNama = "Irwanda Agus Syahputra";
                String validNIM = "202410370110245";

                if (nama.equals(validNama) && nim.equals(validNIM)) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}