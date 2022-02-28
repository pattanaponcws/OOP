public class Square extends GeometricObject implements Colorable{
    public double side;

    public Square(){ }

    public Square(String color,boolean filled,double side){
        super(color,filled);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return side *4;
    }

    public void howToColor(){
        System.out.println("Color all four side.");
    }

    public String toString(){
        return "Side : "+this.side+"\nArea : "+getArea()+super.toString();
    }

}
