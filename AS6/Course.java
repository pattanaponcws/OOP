import java.util.Arrays;

public class Course {
    private String CourseName;
    private String[] students = new String[100];
    private int numberOfStudent;

    public Course(String CourseName){
        this.CourseName = CourseName;
    }

    public void addStudent(String student){
        if(student.length() < numberOfStudent +1){
            students = Arrays.copyOf(students, students.length *2);
        }
        students[numberOfStudent] = student;
        numberOfStudent++;

    }

    public String[] getStudent(){
        return students;
    }

    public int getNumberOfStudent(){
        return numberOfStudent;
    }

    public String getCourse(){
        return CourseName;
    }

    public void dropStudent(String student){
        for(int i =0;i<numberOfStudent;i++){
            if(students[i].equals(student)){
                students[i] = null;
                break;
            }
        }
    }

    public void clear(){
        Arrays.fill(students, null);
    }
}
