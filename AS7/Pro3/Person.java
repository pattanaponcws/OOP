package Pro3;

public class Person {
    private String name;
    private String address;
    private int number;
    private String email;

    public Person(){}

    public Person(String name,String address,int number,String email)
    {
        this.name= name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public void setEmaill(String email){
        this.email = email;
    }
    public String getemail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone: "+getNumber()+"\nEmail: "+getemail();
    }
}
