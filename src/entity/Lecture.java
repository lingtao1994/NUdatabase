package entity;

/**
 * Created by LT on 2018/11/12
 */
public class Lecture {

    private int classroomId;
    private int uosCode;
    private String semester;
    private int year;
    private String classTime;

    public Lecture(int classroomId, int uosCode, String semester, int year, String classTime) {
        this.classroomId = classroomId;
        this.uosCode = uosCode;
        this.semester = semester;
        this.year = year;
        this.classTime = classTime;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
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

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }
}
