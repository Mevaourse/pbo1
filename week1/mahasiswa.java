package week1;
import java.util.*;
import java.util.Iterator;
import java.util.ArrayList;
import week5.Matakuliah;

public class mahasiswa
{
    private String nim;
    private String nama;
    private String tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>();

    public mahasiswa(String nama, String nim, String tanggal_lahir)
    {
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;


    }

    public mahasiswa( String nama, String nim)
    {
        this.nama = nama;
        this.nim = nim;
    }
    public void insertNilai(double n1)
    {
         nilai.add(n1);
    }

    public void insertMatkul(String matkul, String kelompok1, int sks)
    {
        mk.add(new Matakuliah(matkul, kelompok1, sks));
    }

    public void belajar()
    {
        System.out.println(this.nama+"belajar");
    }

    public void absen()
    {
        System.out.println(this.nama+ "dengan nim :"+ this.nim+" sedang absen");
    }

    public void getIdentitas()
    {
            
            System.out.println("Nama  mahasiswa : " + nama);
            System.out.println("Nim mahasiswa : " + nim);
            getNilai();
        
    }

    public String getNama(){
        return nama;
    }
    
    

    public String getTanggal_lahir()
    {
        return tanggal_lahir;
    }
    public void getNilai()
    {
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public void getMatkul()
    {
        Iterator <Matakuliah> matkul  = mk.iterator();
        while(matkul.hasNext())
        {
            Matakuliah m = matkul.next();
                
                System.out.println(m.getNamaMatkul()+ " - " + m.getKelompok()+ " - " + m.getsks());
        }
    }
    public String getNim(){
        return nim;
    }
}