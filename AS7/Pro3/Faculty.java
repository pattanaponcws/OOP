package Pro3;

public class Faculty extends Employee{
    private double office_hours;
    private String rank;

    public Faculty(String name,String address,int number,String email,String office,int salary,double office_hours,String rank){
        super(name,address,number,email,office,salary);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public void setHours(double office_hours){
        this.office_hours = office_hours;
    }
    public double getHours(){
        return this.office_hours;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
    public String getRank(){
        return this.rank;
    }

    @Override
    public String toString() {
        return super.toString()+"Hours: "+getHours()+"\nRank: "+getRank();
    }
}
