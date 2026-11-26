
package Tugas7;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n NOMOR 2 ");
        Mekanis1 m = new Mekanis1();
        m.merek = "Toyota";
        m.warna = "Hitam";
        m.tampilkanData();
        
        System.out.println("\n NOMOR 2 ");
        Kelilingpp k = new Kelilingpp();
        k.tampilkan();

        System.out.println("\n NOMOR 3 ");
        Tanggal_lahir tl = new Tanggal_lahir();
        tl.tampilkan();

        System.out.println("\n NOMOR 4 ");
        SumpahPemuda no4 = new SumpahPemuda();
        no4.sumpahPertama();
        no4.sumpahKedua();
        no4.sumpahKetiga();

        System.out.println("\n NOMOR 5 ");
        Rekursif rk = new Rekursif();
        rk.tampilkan();

        System.out.println("\n NOMOR 6 ");
        Dosen d = new Dosen("Budi");
        Mahasiswa mhs = new Mahasiswa("Andi", "231001", "TI-A");
        Staff s = new Staff("Siti");

        System.out.println("Dosen: " + d.nama);
        System.out.println("Mahasiswa: " + mhs.nama);
        System.out.println("Staff: " + s.nama);
        
        
        System.out.println("\n NOMOR 7 ");
        Mahasiswa mh = new Mahasiswa("", "", "");
        mh.tampilkan();
    }
}


