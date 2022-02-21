package Pro3;

public class Pro3_64011204 {

    public static void main(String[] args) {
        Person person = new Person("John", "12 Bell Street", 23423123, "Jhon@gmail.com");
        Student student = new Student("Somsak", "Chalongkrung Road", 123453, "somasak@gmail.com", 0);
        Employee em = new Employee("Mike", "34 West street", 44335, "mike@gmail.com", "KMITL", 25000);
        Faculty fac = new Faculty("Sue", "28 Well street", 413333, "sue@gmail.com", "KMINTU", 12500, 18, "Professor");
        Staff staff = new Staff("Tom", "90 Country road", 40290, "tom@gmail.com", "Krunglnw Maha NaKron", 65000, "Excutive Assistance");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(em.toString());
        System.out.println(fac.toString());
        System.out.println(staff.toString());
    }
}
