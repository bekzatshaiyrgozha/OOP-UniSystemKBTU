package UniversitySystem.src.attributes;

import UniversitySystem.src.Models.Enums.DayOfWeek;
import UniversitySystem.src.Models.Enums.LessonType;

public class Lesson {
    Course course;
    LessonType lessonType;
    DayOfWeek dayOfWeek;

    public Lesson(Course course, LessonType lessonType, DayOfWeek dayOfWeek) {
        this.course = course;
        this.lessonType = lessonType;
        this.dayOfWeek = dayOfWeek;
    }
    public Course getCourse() {
        return course;
    }
    public LessonType getLessonType() {
        return lessonType;
    }
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }



}

