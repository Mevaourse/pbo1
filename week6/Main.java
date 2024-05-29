package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        // Input data for all employees
        Pegawai[] pegawai = new Pegawai[3];
        
        for (int i = 0; i < 3; i++) {
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
        
        for (int i = 0; i < pegawai.length; i++) {
            System.out.println("Data pegawai ke-" + (i+1)+":");
            System.out.println("Nama: " + pegawai[i].getNama());
            System.out.println("Departemen: " + pegawai[i].getDepartemen());
            System.out.println("Usia: " + pegawai[i].getUsia());
            System.out.println("Gaji: " + pegawai[i].getGaji());
            System.out.println("Masa Kerja: " + pegawai[i].getMasaKerja());
            System.out.println("THR: " + pegawai[i].hitungTHR());
            System.out.println();
        }
    }
}
