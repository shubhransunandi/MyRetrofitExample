package Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Shubhransu on 17-Aug-17.
 */

public class StudentDetails implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.StudentId);
        dest.writeString(this.StudentName);
        dest.writeString(this.StudentMarks);
    }

    public StudentDetails() {
    }

    protected StudentDetails(Parcel in) {
        this.StudentId = in.readInt();
        this.StudentName = in.readString();
        this.StudentMarks = in.readString();
    }

    public static final Parcelable.Creator<StudentDetails> CREATOR = new Parcelable.Creator<StudentDetails>() {
        @Override
        public StudentDetails createFromParcel(Parcel source) {
            return new StudentDetails(source);
        }

        @Override
        public StudentDetails[] newArray(int size) {
            return new StudentDetails[size];
        }
    };
}
