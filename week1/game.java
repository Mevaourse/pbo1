package week1;

public class game
{
    String namagame, tahun;
    int harga;

    public void sold()
    {
        System.out.println(this.nama+"sold");
    }

    public void absen()
    {
        System.out.println(this.nama+"absen");
    }

    public void getIdentitas(){
        System.out.println("Nama mahasiswa : "+ this.nama);
        System.out.println("Nim mahasiswa : "+ this.nim);
        System.out.println("Usia mahasiswa : "+ this.usia);
        
        
    }
}