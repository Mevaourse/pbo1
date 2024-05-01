package week8;
class Person {
    protected String name;
    protected String address;
    protected String hobby;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    
    public void identity()
    {
        System.out.println("Nama :" +name);
        System.out.println("Alamat :" + address);
        displayHobby();

    }

    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public void displayHobby(){
        System.out.println("Hobi : "+ hobby);
    }
    
}
