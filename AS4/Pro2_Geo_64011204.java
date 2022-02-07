import java.util.GregorianCalendar;

public class Pro2_Geo_64011204 {
   public static void main(String[] args) {
       GregorianCalendar cld = new GregorianCalendar();
       System.out.println("Current year, month, date, and day of week");
       System.out.println("Year is "+cld.get(GregorianCalendar.YEAR));
       System.out.println("Month is "+cld.get(GregorianCalendar.MONTH));
       System.out.println("Date is "+cld.get(GregorianCalendar.DATE));
       System.out.println("Day of week is "+cld.get(GregorianCalendar.DAY_OF_WEEK));
       System.out.println("------------\nAfter specified the elapsed time of one day after current day");
       cld.add(GregorianCalendar.DATE, 1);
       System.out.println("Year is "+cld.get(GregorianCalendar.YEAR));
       System.out.println("Month is "+cld.get(GregorianCalendar.MONTH));
       System.out.println("Date is "+cld.get(GregorianCalendar.DATE));
       System.out.println("Day of week is "+cld.get(GregorianCalendar.DAY_OF_WEEK));
       System.out.println(cld.getTime());
   }

}
