public class MahasiswaDemo {

    public static void main(String[] args) {

        System.out.println("== Mahasiswa 1 ==");
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "02342";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println("== Mahasiswa 2 ==");
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060083";
        m2.nama = "Rasya Pradipa Putra";
        m2.alamat = "Ngijo, Karangploso";
        m2.kelas = "2F";
        m2.displayBiodata();

        System.out.println("== Mahasiswa 3 ==");
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "254107060084";
        m3.nama = "Abrakadabra";
        m3.alamat = "Abdurahman saleh";
        m3.kelas = "2F";
        m3.displayBiodata();
    }
}