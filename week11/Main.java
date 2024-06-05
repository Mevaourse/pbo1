package week11;
public class Main {
    public static void main(String[] args){
        Persegi persegi = new Persegi(2);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(8,2);
        Persegipanjang persegipanjang = new Persegipanjang(4,5);

        persegi.luas();
        lingkaran.luas();
        segitiga.luas();
        persegipanjang.luas();

        persegi.keliling();
        lingkaran.keliling();
        segitiga.keliling();
        persegipanjang.keliling();
    }
    
}
