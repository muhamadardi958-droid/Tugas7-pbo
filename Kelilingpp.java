
package Tugas7;

public class Kelilingpp {
    

    int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public void tampilkan() {
        int p = 10;
        int l = 5;

        int hasil = hitungKeliling(p, l);

        System.out.println("Panjang: " + p);
        System.out.println("Lebar: " + l);
        System.out.println("Keliling: " + hasil);
    }
}


