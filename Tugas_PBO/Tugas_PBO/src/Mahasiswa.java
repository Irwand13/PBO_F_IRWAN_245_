public class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Login Mahasiswa Berhasil ===");
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("NIM             : " + getNim());
    }
}
