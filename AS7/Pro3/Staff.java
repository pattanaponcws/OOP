package Pro3;

public class Staff extends Employee{
    private String title;

    public Staff(String name,String address,int number,String email,String office,int salary,String title){
        super(name,address,number,email,office,salary);
        this.title = title;
    }

    public void setTitle(String tiltle){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Title: "+getTitle();
    }
}
