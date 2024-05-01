package week8;
import java.util.Scanner;


class InheritMain {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Input nama : ");
        String name = scan.nextLine();
        System.out.print("Input alamat : ");
        String address = scan.nextLine();
        System.out.print("Input nim : ");
        String nim = scan.nextLine();

        Student mahasiswa = new Student(name, address,nim);

        System.out.print("Input hobi :");
        String hobby = scan.nextLine();
        mahasiswa.setHobby(hobby);

        System.out.println("Hitung Pembayaran : ");
        System.out.println();
        mahasiswa.hitungPembayaran();


        

         
    }
    
}
