package week8;


public class Student extends Person
{
    String nim;


    public Student(String name, String address, String nim){
        super(name, address);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void identity()
    {
        System.out.println("NIM :" + getNim());

        super.identity();
    }
    
}

