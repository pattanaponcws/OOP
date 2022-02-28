
import java.util.Date;

public abstract class GeometricObject{
    private String color = "None";
    private boolean filled = false;
    private Date dateCreated  = new Date();

    protected GeometricObject(){ }
    protected GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFill(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "\nColor : "+color+"\nFill : "+filled+"\nCreate on : "+getDateCreated();
    }

    public abstract double getArea();

    public abstract double getPerimeter();


}