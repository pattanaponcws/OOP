public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;

    public Octagon(){super();}

    public Octagon(double side){
        this.side = side;
    }

    public Octagon clone() throws CloneNotSupportedException{
        return (Octagon)super.clone();
    }

    public double getArea(){
        return 2 * (1+Math.sqrt(2)) * side * side;
    }

    public double getPerimeter(){
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea())
            return 1;
        else if(this.getArea() < o.getArea()){
            return -1;
        }
        else
            return 0;
    }

    public String toString(){
        return "Area: "+getArea()+"\nPerimeter : "+getPerimeter();
    }
    
}
