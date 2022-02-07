public class Pro2_64011204 {
    public static void main(String[] args) {
        RegularPolygon polygon = new RegularPolygon();
        RegularPolygon polygon1 = new RegularPolygon(6,4);
        RegularPolygon polygon2 = new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println("The perimeter of polygon : "+polygon.getPerimeter());
        System.out.println("The Area of polygon : "+polygon.Area());
        System.out.println("The perimeter of polygon1 : "+polygon1.getPerimeter());
        System.out.println("The Area of polygon1 : "+polygon1.Area());
        System.out.println("The perimeter of polygon2 : "+polygon2.getPerimeter());
        System.out.println("The Area of polygon2 : "+polygon2.Area());

    }
}
