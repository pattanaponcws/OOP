
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }

    public RegularPolygon(int numberofSide,double LenghtofSide){
        n = numberofSide;
        side = LenghtofSide;
    }

    public RegularPolygon(int numberofSide,double LenghtofSide,double x,double y){
        n = numberofSide;
        side = LenghtofSide;
        this.x = x;
        this.y = y;
    }

    public int getn(){
        return this.n;
    }

    public void setn(int n){
        this.n = n;
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getx(){
        return this.x;
    }

    public void setx(double x){
        this.x=x;
    }

    public double gety(){
        return this.y;
    }

    public void sety(double y){
        this.y =y;
    }

    public double getPerimeter(){
        return this.side*this.n;
    }

    public double Area(){
        double area;
        area = (this.n*this.side*this.side) / (4*Math.tan(Math.PI/this.n));
        return area;
    }
}
