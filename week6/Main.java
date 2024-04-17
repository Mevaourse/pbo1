package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        // Input data for all employees
        Pegawai[] pegawai = new Pegawai[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Input data pegawai " + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = inp.nextLine();
            System.out.print("Departemen: ");
            String departemen = inp.nextLine();
            System.out.print("Usia: ");
            int usia = inp.nextInt();
            System.out.print("Gaji: ");
            double gaji = inp.nextDouble();
            System.out.print("Masa Kerja: ");
            int masaKerja = inp.nextInt();
            inp.nextLine(); // Consume newline
            pegawai[i] = new Pegawai(nama, departemen, usia, gaji, masaKerja);
        }
        
        // Display data and THR for all employees
        System.out.println("\nData Pegawai:");
        for (Pegawai p : pegawai) {
            System.out.println("Nama: " + p.getNama());
            System.out.println("Departemen: " + p.getDepartemen());
            System.out.println("Usia: " + p.getUsia());
            System.out.println("Gaji: " + p.getGaji());
            System.out.println("Masa Kerja: " + p.getMasaKerja());
            System.out.println("THR: " + p.hitungTHR());
            System.out.println();
        }
    }
}
