// @author : Pritam Chakraborty
// @date : 28/07/2021
package CollegeTest.college;

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
    
    @Override
    public String toString() {
        return "Student [\nSCollege=" + SCollege +  ", \n" +
                " admissionYear_=" + admissionYear_ +  ", \n" +
                " marks_=" + marks_ +  ", \n" +
                " roll_=" + roll_ +  ", \n" +
                " sname_=" + sname_ +  ", \n" +
                " stream_=" + stream_ +  ", \n" +
                "]" + "\n" ;
    }
}
