package week10;

public class Bangundatar 
{
    private int panjang;
    private int lebar;
    private double dasar;
    private double tinggi;
    private double diameter;
    private int sisi;
    private static final double pi = 3.14;

    public  Bangundatar(int sisi)
    {
        this.sisi = sisi;
    }
    
    public Bangundatar(int panjang, int lebar )
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Bangundatar(double dasar, double tinggi){
        this.dasar = dasar;
        this.tinggi = tinggi;
    }

    public Bangundatar(double dimeter){
        this.diameter = diameter;
    }
    


    public int luas(int a){
        return a*a;
    }

    public int luas(int b, int a){
        return a*b;
    }

    public double luas(double a,double b)
    {
        return a*b/2;
    }

    public double luas(double a){
        return pi*a*a;
    }
    
    public int keliling(int a){
        return a*4;
    }

    public int keliling (int a, int b){
        return (2*a)+(2*b);
    }

    public double keliling(double a){
        return pi*2*a;

    }

}
