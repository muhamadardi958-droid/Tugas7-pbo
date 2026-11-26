
package Tugas7;

public class Rekursif {
    
    void hitungMundur(int angka) {
        if (angka > 0) {
            System.out.println(angka);
            hitungMundur(angka - 1);
        }
    }

    public void tampilkan() {
        hitungMundur(5);
    }
}


