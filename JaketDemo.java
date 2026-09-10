public class JaketDemo {
    public static void main(String[] args) {

        Jaket jaket1 = new Jaket();
        Jaket jaket2 = new Jaket();

        jaket1.merk = "Adidas";
        jaket1.warna = "Hitam";
        jaket1.ukuran = "M";
        jaket1.harga = 2000000;
        jaket1.jenisKain = "katun";

        jaket2.merk = "Nike";
        jaket2.warna = "Biru";
        jaket2.ukuran = "L";
        jaket2.harga = 2500000;
        jaket2.jenisKain = "katun";

        System.out.println("=== JAKET 1 ===");
        jaket1.displayInfo();
        jaket1.memakaiJaket();
        jaket1.melepasJaket();

        System.out.println();

        System.out.println("=== JAKET 2 ===");
        jaket2.displayInfo();
        jaket2.memakaiJaket();
        jaket2.melepasJaket();
    }
}
