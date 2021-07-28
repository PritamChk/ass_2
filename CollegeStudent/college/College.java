package CollegeStudent.college;

import java.util.ArrayList;

import CollegeStudent.student.Student;

public class College {
    private String col_id_ = null;
    private String col_name_ = null;
    private static ArrayList<Student> students_= new ArrayList<Student>() ;

    public College(){}

    // public College(String col_id, String col_name, Student s){
    public College(String col_id, String col_name){
        col_id_ = col_id;
        col_name_ = col_name; 
        //students_.add(s);
    }

    public String getCol_id() {
        return col_id_;
    }

    public String getCol_name() {
        return col_name_;
    }

    public int getNumberOfStudents() {
        // This function returns no of students in that school.
        return students_.size();
    }

    public void getStudentDetails(){
        int nos = getNumberOfStudents();
        for(int i=0; i<nos ; i++){
            System.out.println(students_.get(i));
        }
    }

    protected static void admitStudent_(Student s){
        students_.add(s);
        System.out.println("Student is admitted");
    }

}
