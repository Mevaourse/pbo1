package week1;
import java.util.*;

public class mahasiswa
{
    String[] nim, nama ;
    int[] usia;
    Double[]ipk;

    public mahasiswa(String[] nim, String[] nama, Double[] ipk, int[] usia)
    {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.usia = usia;


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
        for (int i = 0; i < nim.length; i++) {
            System.out.println("Data mahasiswa ke- " + (i + 1));
            System.out.println("Nim mahasiswa : " + nim[i]);
            System.out.println("Nama  mahasiswa : " + nama[i]);
            System.out.println("IPK :" + ipk[i]);
            System.out.println("Usia Mahasiswa :" + usia[i]);
        }
        
    }
}