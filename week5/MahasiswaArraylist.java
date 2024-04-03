package week5; 
import week1.mahasiswa;
import java.util.*;

public class MahasiswaArraylist {

    public static void main(String[] args)
    {
        mahasiswa mhs = new mahasiswa ("Budi", "a11.22");
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
