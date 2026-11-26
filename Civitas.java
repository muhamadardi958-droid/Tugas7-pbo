package Tugas7;

public class Civitas {
    String nama;

    Civitas(String nama) {
        this.nama = nama;
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama);
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama);
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama);
    }
}