public class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUser, String inputPass) {
        return inputUser.equals(username) && inputPass.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Login Admin Berhasil ===");
        System.out.println("Nama Admin : " + getNama());
        System.out.println("NIM         : " + getNim());
    }
}
