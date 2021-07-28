package CollegeTest.college;

import CollegeStudent.college.College;

public class Student {
    String sname_ = null;
    int roll_ = 0;
    int marks_ = 0;
    String admissionYear_ = null;
    String stream_ = null;
    College SCollege = null;

    public Student() {
    }

    public Student(String sname_, int roll_, int marks_, String admissionYear_, String stream_, College sCollege) {
        this.sname_ = sname_;
        this.roll_ = roll_;
        this.marks_ = marks_;
        this.admissionYear_ = admissionYear_;
        this.stream_ = stream_;
        SCollege = sCollege;
    }

    @Override
    public String toString() {
        return "Student [SCollege=" + SCollege + 
                ", admissionYear_=" + admissionYear_ + 
                ", marks_=" + marks_ + 
                ", roll_=" + roll_ + 
                ", sname_=" + sname_ + 
                ", stream_=" + stream_ + 
                "]";
    }

    public String getSname_() {
        return sname_;
    }

    public int getRoll_() {
        return roll_;
    }

    public int getMarks_() {
        return marks_;
    }

    public String getAdmissionYear_() {
        return admissionYear_;
    }

    public College getSCollege() {
        return SCollege;
    }

}
