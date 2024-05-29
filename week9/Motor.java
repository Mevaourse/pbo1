package week9;


public class motor extends Kendaraan {
    int cc;
    String jenisbensin;


    public motor (String merk, int roda, int speed, String warna ,int cc, String jenisbensin)
    {
        super(merk,roda,speed,warna);
        this.cc = cc;
        this.jenisbensin = jenisbensin;

    }


    public String getJenisBensin(){
        return jenisbensin;
    }


    public void getAllatribute(){
        System.out.println(super.getMerk);
        System.out.println(super.getWarna);
        System.out.println(super.getRoda);
        System.out.println(super.getSpeed);
        System.out.println(getCC());
        System.out.println (getJenisBensin());
    }
    public int getCC(){
        return cc;
    }

    public void rem(){

    }

    

    
}
