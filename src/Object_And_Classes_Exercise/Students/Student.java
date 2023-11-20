package Object_And_Classes_Exercise.Students;

public class Student {
    private String firstName;
    private String lastName;
    private Double grade;

    public Student(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getGrade() {
        return grade;
    }
}
