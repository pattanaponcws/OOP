public class Pro1_Stock_64011204{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    double change;
    public Pro1_Stock_64011204(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public String getsymbol(){
        return symbol;
    }

    public String getname(){
        return name;
    }

    double getChangePercent(){
        change = (currentPrice-previousClosingPrice)/currentPrice * 100;
        return change;
    }
}