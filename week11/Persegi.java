package week11;

public class Persegi extends Bangundatar {
    
    private int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public void luas(){
        System.out.println("Luas persegi adalah : "+ sisi*sisi);
    }

    public void keliling(){
        System.out.println("Keliling persegi adalah : " + sisi*4);
    }
    public int getSisi(){
        return this.sisi;
    }
}
