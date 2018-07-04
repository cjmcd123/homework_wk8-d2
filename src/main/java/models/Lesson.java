package models;

import javax.persistence.*;


@Entity
@Table(name = "lessons")
public class Lesson {

    private int id;
    private String title;
    private int roomNumber;
    private String date;
    private Course course;
    private Instructor instructor;

    public Lesson(){

    }

    public Lesson(String title, int roomNumber, String date, Course course, Instructor instructor) {
        this.title = title;
        this.roomNumber = roomNumber;
        this.date = date;
        this.course = course;
        this.instructor = instructor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "room_number")
    public int getRoomNumber() {
        return roomNumber;
    }

    @Column(name = "date")
    public String getDate() {
        return date;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    public Instructor getInstructor() {
        return instructor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
