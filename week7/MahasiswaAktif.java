package week7;
import java.util.Locale;
import week1.mahasiswa;

public class MahasiswaAktif extends mahasiswa
{
    
    public int usia;
    public int semester;

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester, int usia)
    {
        super(nama,nim,tanggal_lahir);
        this.semester = semester;
        this.usia = usia;

    }

    //overriding

    
    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa :" + super.getNama());
        System.out.println("Nim mahasiswa : "+ super.getNim());
        System.out.println("Tanggal lahir :" + super.getTanggal_lahir());
        System.out.println("Semester : "+ getSemester());
        System.out.println("Usia : "+ getUsia());
    }

    public int getSemester(){
        return semester;
    }

    public int getUsia(){
        return usia;
    }
}
