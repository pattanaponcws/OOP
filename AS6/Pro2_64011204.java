import java.util.Objects;

public class Pro2_64011204 {
    public static void main(String[] args) {
        Course course = new Course("Course");
        course.addStudent("one");
        course.addStudent("two");
        course.addStudent("three");

        for (String s : course.getStudent()) {
            if (Objects.nonNull(s)) {
                System.out.print(s + " ");
            }
        }

        System.out.println(" ");
        course.dropStudent("two");

        for (String s : course.getStudent()) {
            if (Objects.nonNull(s)) {
                System.out.print(s + " ");
            }
        }

        course.clear();

        System.out.println(" ");
        for (String s : course.getStudent()) {
            if (Objects.nonNull(s)) {
                System.out.print(s + " ");
            }
        }
    }
}
