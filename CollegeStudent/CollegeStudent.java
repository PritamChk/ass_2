package CollegeStudent;

import CollegeStudent.college.College;
import CollegeStudent.student.Student;

public class CollegeStudent {
    public static void main(String[] args) {
        College c1 = new College("130","TMSL");
        Student Rivu = new Student(c1,"Rivu",10,"MCA","26/10/2020",100);
        Student Rimi = new Student(c1,"Rimi",1,"MCA","26/10/2020",200);
        
        System.out.println(Rivu);
        System.out.println(Rimi);
        
        System.out.println("No of Students in TMSL : "+c1.getNumberOfStudents());

        c1.getStudentDetails();
    }
}
