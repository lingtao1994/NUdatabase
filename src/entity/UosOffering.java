package entity;

/**
 * Created by LT on 2018/11/12
 */
public class UosOffering {

    private int uosCode;
    private String semester;
    private int year;
    private String textBook;
    private int enrollment;
    private int maxEnrollment;
    private int instructorId;

    public UosOffering(int uosCode, String semester, int year, String textBook, int enrollment, int maxEnrollment, int instructorId) {
        this.uosCode = uosCode;
        this.semester = semester;
        this.year = year;
        this.textBook = textBook;
        this.enrollment = enrollment;
        this.maxEnrollment = maxEnrollment;
        this.instructorId = instructorId;
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

    public String getTextBook() {
        return textBook;
    }

    public void setTextBook(String textBook) {
        this.textBook = textBook;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
