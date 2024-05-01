package week8;
import java.util.Scanner;

public class Student extends Person
{
    String nim;


    public Student(String name, String address, String nim){
        super(name, address);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void identity()
    {
        System.out.println("NIM :" + getNim());

        super.identity();

    }
    
    public void hitungPembayaran()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Input biaya SPP : ");
        int spp = scan.nextInt();
        System.out.print ("Input biaya SKS : ");
        int sks = scan.nextInt();
        System.out.print ("Input Modul : ");
        int modul = scan.nextInt();
        System.out.println();
        int total = spp + sks + modul;

        identity();
        System.out.println("Tagihan pembayaran : "+ total);
    }
}

