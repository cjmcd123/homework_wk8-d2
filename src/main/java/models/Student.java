package models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int enrollment_number;
    private Course course;

    public Student(){

    }

    public Student(String first_name, String last_name, int age, int enrollment_number, Course course) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.enrollment_number = enrollment_number;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "first_name")
    public String getFirst_name() {
        return first_name;
    }

    @Column(name = "last_name")
    public String getLast_name() {
        return last_name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @Column(name = "enrolmet_number")
    public int getEnrollment_number() {
        return enrollment_number;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEnrollment_number(int enrollment_number) {
        this.enrollment_number = enrollment_number;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
