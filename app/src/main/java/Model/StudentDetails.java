package Model;

/**
 * Created by Shubhransu on 17-Aug-17.
 */

public class StudentDetails {
    /**
     * StudentId : 1
     * StudentName : Rahul
     * StudentMarks : 83
     */

    private int StudentId;
    private String StudentName;
    private String StudentMarks;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(String StudentMarks) {
        this.StudentMarks = StudentMarks;
    }

    @Override
    public String toString() {
        return "Student Id : "+StudentId+"\n"+"Student Name : "+StudentName+"\n"+"Student Marks : "+StudentMarks;
    }
}
