package week5; 
import week1.mahasiswa;
import java.util.*;

public class MahasiswaArraylist {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Masukkan nama mahasiswa : ");
        String nama = inp.nextLine();
        System.out.println("Masukkan nim mahasiswa :"); 
        String nim = inp.nextLine();
        mahasiswa mhs = new mahasiswa(nama, nim);
        
        mhs.insertNilai(86);
        mhs.insertNilai(60);
        mhs.insertNilai(76.6);
        mhs.insertNilai(85.6);
        mhs.insertMatkul("matematika", "a4442",4);
        mhs.insertMatkul("PBO", "a114233", 4);

        mhs.getIdentitas();
        mhs.getMatkul();
    }
    
}
