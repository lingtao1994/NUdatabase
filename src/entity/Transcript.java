package entity;

/**
 * Created by LT on 2018/11/12
 */
public class Transcript {

    private int id;
    private int uosCode;
    private String semester;
    private int year;
    private double grade;

    public Transcript(int id, int uosCode, String semester, int year, double grade) {
        this.id = id;
        this.uosCode = uosCode;
        this.semester = semester;
        this.year = year;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUosCode() {
        return uosCode;
    }

    public void setUosCode(int uosCode) {
        this.uosCode = uosCode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
