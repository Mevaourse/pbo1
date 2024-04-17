package week5;



public class Matakuliah
{
    private String matkul;
    private String kelompok1;
    private int sks;
    
    public Matakuliah(String matkul, String kelompok1, int sks)
    {
        this.matkul = matkul;
        this.kelompok1 = kelompok1;
        this.sks = sks;
    }

    public String getNamaMatkul()
    {
        return matkul;
    }

    public String getKelompok()
    {
        return kelompok1;
    }

    public int getsks()
    {
        return sks;
    }
}