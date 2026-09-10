public class persegipanjang {

    int panjang;
    int lebar;

    void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }

    int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() { 
        return 2 * (panjang + lebar);
    }
}