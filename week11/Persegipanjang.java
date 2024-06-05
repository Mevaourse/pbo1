package week11;

public class Persegipanjang extends Bangundatar
{
    private int panjang;
    private int lebar;

    public Persegipanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void luas(){
        System.out.println("Luas persegi panjang adalah : "+ panjang*lebar);
    }

    public void keliling(){
        System.out.println("Keliling persegi panjang adlaah : "+ (panjang+lebar)*2);
    }
}