public class Mobil {
    // Atribut dari class Mobil
    private String merek;
    private String model;
    private int tahunPembuatan;

    // Konstruktor untuk inisialisasi objek Mobil
    public Mobil(String merek, String model, int tahunPembuatan) {
        this.merek = merek;
        this.model = model;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
    }

    // Metode main untuk membuat objek dan menguji class Mobil
    public static void main(String[] args) {
        // Membuat objek lMobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);

        // Memanggil metode displayInfo untuk menampilkan informasi
        System.out.println("Informasi Kendaraan:");
        mobil1.displayInfo();
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }
}