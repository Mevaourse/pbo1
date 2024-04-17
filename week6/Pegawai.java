package week6;


public class Pegawai {
    private String nama;
    private String departemen;
    private int usia;
    private double gaji;
    private int masaKerja;

    // Constructor
    public Pegawai(String nama, String departemen, int usia, double gaji, int masaKerja) {
        this.nama = nama;
        this.departemen = departemen;
        this.usia = usia;
        this.gaji = gaji;
        this.masaKerja = masaKerja;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public int getUsia() {
        return usia;
    }

    public double getGaji() {
        return gaji;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    // Method to calculate THR
    public double hitungTHR() {
        double thr = 0;
        if (masaKerja < 1) {
            thr = 0.1 * 5 * gaji;
        } else if (masaKerja >= 1 && masaKerja <= 5) {
            thr = 0.25 * 5 * gaji;
        } else {
            thr = 0.35 * 5 * gaji;
        }
        if (gaji > 5000000) {
            thr -= 0.01 * gaji;
        }
        return thr;
    }
}
