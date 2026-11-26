
package Tugas7;

public class Mekanis1 {
  
    String merek;
    String warna;

    void tampilkanData() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Warna Mobil: " + warna);
    }

    public static void main(String[] args) {

        Mekanis1 m = new Mekanis1();

        m.merek = "Toyota";
        m.warna = "Hitam";

        m.tampilkanData();
    }
}


