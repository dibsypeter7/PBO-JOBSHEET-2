public class Jaket {
    String merk;
    String warna;
    String ukuran;
    int harga;
    String jenisKain;

    void displayInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Harga       : " + harga);
        System.out.println("Jenis Kain  : " + jenisKain);
    }

    void memakaiJaket() {
        System.out.println("Jaket " + merk + " sedang dipakai");

    }
    void melepasJaket() {
        System.out.println("Jaket " + merk + " sedang dilepas");
    }
    
}
