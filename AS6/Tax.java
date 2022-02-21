
public class Tax {
    
    int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950}, // Single filer
        {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
        {8350, 33950, 68525, 104425, 186475}, // Married separately
        {11950, 45500, 117450, 190200, 372950} // Head of household
    };

    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.36};

    private double calTex(int filler,int income){
        int[] fillament = brackets[filler];
        double total=0;
        for (int i=1;i<fillament.length;i++){
            double prv = fillament[i-1];
            double cur = fillament[i];
            if(income < prv){
                break;
            }else if(income<cur){
                cur = income;
            }


            total += (cur-prv)*rates[i-1];
        }

        return total;
    }
    private int status;
    private double taxableIncome;
    private double tax;

    Tax(int filler,int income){
        this.status = 0;
        this.tax = this.calTex(filler, income);
        this.taxableIncome = this.tax+income;
    }

    public int getstatus(){
        return status;
    }

    public double getTaxableIncome(){
        return taxableIncome;
    }

    public double getTax(){
        return tax;
    }
   

}
