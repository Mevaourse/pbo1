package week10;
public class Main {
    public static void main(String[] args){
        Bangundatar Persegipanjang = new Bangundatar(2,3);
        Bangundatar Persegi = new Bangundatar(2);
        Bangundatar segitiga = new Bangundatar(4.0,3.0);
        Bangundatar lingkaran = new Bangundatar(7.0);

        int luasPersegipanjang = Persegipanjang.luas(2,3);
        int luasPersegi = Persegi.luas(3);
        double luassegitiga = segitiga.luas(4.0,3.0);
        double luaslingkaran = lingkaran.luas(7.0);

        int kelilingpersegipanjang = Persegipanjang.keliling(2,3);
        int kelilingpersegi = Persegi.keliling(3);
        double kelilinglingkaran = lingkaran.keliling(7.0);

        System.out.println (" Luas persegi panjang "+ luasPersegipanjang + " keliling : "+ kelilingpersegipanjang );
        System.out.println (" Luas persegi "+ luasPersegi + " Keliling : "+ kelilingpersegi);
        System.out.println (" Luas segitiga"+ luassegitiga );
        System.out.println (" Luas lingkaran"+ luaslingkaran + " Keliling :" + kelilinglingkaran);
    }
}
