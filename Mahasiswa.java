package Tugas7;
import java.util.Scanner;

public class Mahasiswa {

    String nama;
    String npm;
    String kelas;

    Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NPM: " + this.npm);
        System.out.println("Kelas: " + this.kelas);
    }

    public void tampilkan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, npm, kelas);

        System.out.println("\nData Mahasiswa");
        mhs.tampilkanData();
    }
}
