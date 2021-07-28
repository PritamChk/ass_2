package CollegeStudent.student;

import CollegeStudent.college.College;

public class Student extends College{
    private int roll_ = -1;
    private String name_ = null;
    private  String stream_  = null;
    private String admission_year_ = null;
    private int marks_ = 0 ;

    public Student(){}

    public Student(String cid, String cname ,String name,int roll, String stream, String admission, int marks){
        // Constructor
        //@param : cid -> College ID
        //@param : cname -> College Name
        //@param : name -> Student Name
        //@param : roll -> Student Name
        //@param : stream -> Stream Taken by the student
        //@param : admission -> Student's Admission Date in DD/MM/YYYY format
        //@param : marks -> Total Marks obtained till now
        super(cid,cname);
        roll_ = roll;
        name_ = name;
        stream_ = stream;
        admission_year_ = admission;
        marks_ = marks;
        admitStudent_(this);
    }

    @Override
    public String toString() {
         return new String("Name : "+ name_+ "\n" +
        "roll : "+ roll_  + "\n" +
        "stream : "+ stream_ + "\n" + 
        "admission_year : "+ admission_year_ + "\n" +
        "College Id : "+ getCol_id() + "\n" +
        "College Name : "+ getCol_name() + "\n" +
        "Marks : "+ marks_) ;
    }
}
