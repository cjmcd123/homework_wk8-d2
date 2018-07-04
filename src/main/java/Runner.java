import db.DBCourse;
import db.DBHelper;
import db.DBInstructor;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("Computing", Level.BSC);
        DBHelper.save(course1);
        Course course2 = new Course("Engineering", Level.BENG);
        DBHelper.save(course2);

        Student student1 = new Student("Craig", "McDowall", 26, 1, course1);
        DBHelper.save(student1);
        Student student2 = new Student("Bob", "Bob", 30, 2, course2);
        DBHelper.save(student2);
        Student student3 = new Student("Jenny", "Rose", 22, 3, course1);
        DBHelper.save(student3);

        Instructor instructor = new Instructor("John McCollum");
        DBHelper.save(instructor);

        Lesson lesson1 = new Lesson("Intro", 12, "2018-08-12" , course1, instructor);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Java", 52, "2018-11-11", course1, instructor);
        DBHelper.save(lesson2);


        List<Student> studentsOnCourse = DBCourse.getStudentsOnCourse(course1);

        List<Lesson> courseLessons = DBCourse.getCourseLessons(course1);

        List<Lesson> instructorLessons = DBInstructor.getLessons(instructor);

    }
}
