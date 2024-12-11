package UniversitySystem.src.attributes;

import UniversitySystem.src.Models.Person.Teacher;

public class Mark {
    double firstMark;
    double secondMark;
    double finalMark;

    public Mark(double firstMark, double secondMark, double finalMark) {
        this.firstMark = firstMark;
        this.secondMark = secondMark;
        this.finalMark = finalMark;

    }
    public double getFirstMark() {
        return firstMark;
    }
    public void setFirstMark(double firstMark) {
        this.firstMark = firstMark;

    }

    public double getSecondMark() {
        return secondMark;
    }
    public void setSecondMark(double secondMark) {
        this.secondMark = secondMark;
    }
    public double getFinalMark() {
        return finalMark;
    }
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

}
