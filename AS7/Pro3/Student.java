package Pro3;

public class Student extends Person{
    private int status;

    public Student(int status){
        this.status = status;
    }

    public Student(String name,String address,int number,String email,int status){
        super(name,address,number,email);
        this.status = status;
    }

    public String statusName(){
        switch(status){
            case 0:
                return "freshman";
            case 1:
                return "saphomo";
            case 2:
                return "junior";
            case 3:
                return "senior";
            default:
                return null;
        }
    }

    public int getStatus(){
        return this.status;
    }
    public void setStatus(int status){
        this.status=status;
    }

    @Override
    public String toString() {
        
        return "Student\n"+
                "Name : "+getName()+"\n"+
                "Address: "+getAddress()+"\n"+
                "Phone : "+getNumber()+"\n"+
                "Email : "+getemail()+"\n"+
                "Status: "+statusName();
    }

}