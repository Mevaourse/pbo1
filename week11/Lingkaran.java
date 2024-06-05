package week11;
public class Lingkaran extends Bangundatar {
    private int radius;
    private static final double pi =3.14;


    public Lingkaran(int radius){
        this.radius = radius;
    }
    
    public void luas()
    {
        System.out.println("Luas Lingkaran adalah : "+ radius*radius*pi);
    }

    public void keliling()
    {
        System.out.println("Kelilinng lingkaran adalah : " + radius*2*pi);
    }

    public int getRadius(){
        return radius;
    }
}
