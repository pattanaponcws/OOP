
public class Pro1_StockTest {
    public static void main(String[] args) {
        Pro1_Stock_64011204 stock = new Pro1_Stock_64011204("ORCL","Oracle Coperation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Symbol : "+stock.getsymbol());
        System.out.println("Name : "+ stock.getname());
        System.out.println("Previous Closing Price : "+stock.previousClosingPrice);
        System.out.println("Current Prince : "+stock.currentPrice);
        System.out.println("Price Change : "+stock.getChangePercent());
    }
}
