package week9;

public class Kendaraan {

    private String merk;
    private int speed;
    private int roda;
    private String warna;

    public Kendaraan(String merk, int speed, int roda, String warna)
    {
        this.merk = merk;
        this.speed = speed;
        this.roda = roda;
        this.warna = warna;
    }

    public String getMerk(){
        return merk;
    }

    public int getRoda(){
        return roda;
    }
    
    public int getSpeed(){
        return speed;
    }

    public String getWarna(){
        return warna;
    }

    public void gerak(){

        
    }

    
    
}
