package week8;
class Person {
    protected String name;
    protected String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    
    public void identity()
    {
        System.out.println("Nama :" +name);
        System.out.println("Alamat :" + address);

    }
    
}
