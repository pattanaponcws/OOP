public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle(){ }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getPerimeter(){
        return 2*(height+width);
    }

    public double getArea(){
        return height * width;
    }

    @Override
    public int compareTo(Rectangle o) {
        if(this.getArea() > o.getArea())
            return 1;
        else if(this.getArea() < o.getArea()){
            return -1;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return this.compareTo((Rectangle) obj) == 0;
        } else
            return false;
    }
}
