public class demopersegi {

    public static void main(String[] args) {

        persegipanjang p1 = new persegipanjang();

        p1.panjang = 10;
        p1.lebar = 5;

        System.out.println("=== DATA PERSEGI PANJANG ===");

        p1.displayInfo();

        System.out.println("Luas     : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
    }
}