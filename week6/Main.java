import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data for all employees
        Pegawai[] pegawai = new Pegawai[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Input data pegawai " + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Departemen: ");
            String departemen = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            System.out.print("Gaji: ");
            double gaji = scanner.nextDouble();
            System.out.print("Masa Kerja: ");
            int masaKerja = scanner.nextInt();
            scanner.nextLine(); // Consume newline
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
