public class Pro1_64011204 {
    public static void main(String[] args) {
        int birth,death,immigrant;

        int time = 365*5*24*60*60; //persec //Next Five Years 

        birth = time / 7;
        death = time /13;
        immigrant = time / 45;
        int population,currentPop = 312032486;

        population = currentPop + birth - death - immigrant;

        System.out.println(population);
    }
}
