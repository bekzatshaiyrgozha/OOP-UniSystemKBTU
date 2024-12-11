package UniversitySystem.src.attributes;

import UniversitySystem.src.Models.Enums.CourseType;
import UniversitySystem.src.Models.Enums.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Course {
    private String name;
    private int credits;
    private CourseType courseType;
    private Faculty faculty;




    public Course(String name, int credits, CourseType courseType, Faculty faculty) {
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
        this.faculty = faculty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public CourseType getCourseType() {
        return courseType;
    }
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }




}
