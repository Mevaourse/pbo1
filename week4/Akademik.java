package week4;
import week1.mahasiswa;
import java.util.*;

public class Akademik 
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Masukkan Jumlah data : ");
        
        //buat objek dari class scanner untuk menginput data

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        String[] nim = new String[n];
        String[] nama = new String[n];
        Double[] ipk = new Double[n];
        int[] usia = new int[n];
        
        for (int i=0; i < n; i++)
            {
                System.out.println("Data ke-"+(i+1));
                System.out.println("Masukkan NIM :");
                nim[i] = inp.next();
                System.out.println("Masukkan NAMA :");
                nama[i] = inp.next();
                System.out.println("Masukkan IPK :");
                ipk[i] = inp.nextDouble();         
                System.out.println("Masukkan usia:");
                usia[i] = inp.nextInt();

            }      
        mahasiswa mhs = new mahasiswa(nim,nama,ipk,usia);

        mhs.getIdentitas();
    }
}
