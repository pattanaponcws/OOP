package Pro3;


public class Employee extends Person{
    private String office;
    private int salary;

    public Employee(String name,String address,int number,String email,String office,int salary){
        super(name,address,number,email);
        this.office=office;
        this.salary=salary;
    }

    public void setOffice(String office){
        this.office=office;
    }
    public String getOffice(){
        return this.office;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    @Override
    public String toString() {

        return super.toString()+
        "Office: "+getOffice()+"\n"+
        "Salary: "+getSalary();
    }

}
