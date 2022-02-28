public class Pro2_64011204 {
    public static void main(String[] args) {
        GeometricObject[] sq = {new Square("red",true,2),new Square("red",true,3),new Square("red",true,4),new Square("red",true,5),new Square("red",true,6)};

        for(int i=0;i<sq.length;i++){
            Square square = (Square) sq[i];
            System.out.println(sq[i].toString());
            square.howToColor();
            System.out.println("-----------------------------------------");
            

        }
    }
}
