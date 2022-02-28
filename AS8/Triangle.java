

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){ }

    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public void setside1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setside3(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double s = (side1+side2+side3) * 0.5;

        return Math.sqrt(s * (s-side1)* (s-side2) * (s-side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return "Perimeter: "+getPerimeter()+"\nArea: "+getArea()+super.toString();
    }
}
