public class BMI {
    private String name;
    private int age;
    private double weight,height;
    public final double pound = 0.45359237;
    public final double inch = 0.0254;
    private double bmi;

    public BMI(String name,int age,double weight,double feet,double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = (feet/12)+inches;
    }

    public double getBMI(){
        bmi = (weight * pound)/(height * inch)*(height* inch);
        return bmi;
    }

    public String getBMIStatus(){
        double bmi = getBMI();
        if(bmi<18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obase";
            
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }


}
