
package Tugas7;

public class Tanggal_lahir {
    
    int hitungTanggal(int bulan, int tanggal) {
        return bulan * 100 + tanggal;
    }

    public void tampilkan() {
        int bulan = 1;
        int tanggal = 14;

        int hasil = hitungTanggal(bulan, tanggal);

        System.out.println("Bulan: " + bulan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Hasil Akhir: " + hasil);
    }
}

