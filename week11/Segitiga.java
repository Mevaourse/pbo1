package week11;

public class Segitiga extends Bangundatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void luas(){
        System.out.println("Luas segitiga adalah : " + alas*tinggi/2);
    }
    public void keliling(){
        System.out.println("Keliling segitiga adalah : " + alas*3 );
    }
    
}
