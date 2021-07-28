// @author : Pritam Chakraborty
// @date : 28/07/2021
package CollegeTest;

import CollegeTest.college.College;
import CollegeTest.college.Student;

public class CollegeTest {
    public static void main(String[] args) {
        College[] colleges = {
                                new College("TMSL","130"),
                                new College("SXC","102")
                            } ;

        Student[] students =    {
                                    new Student("Rivu", 32, 100, "2020", "MCA", colleges[0]),
                                    new Student("Rimi", 16, 200, "2020", "MCA", colleges[0]),
                                    new Student("Pritam", 40, 150, "2017", "CS", colleges[1]),
                                    new Student("Tathagata", 50, 120, "2020", "MCA", colleges[1]),
                                    new Student("Priyesh", 18, 90, "2018", "MCA", colleges[0])
                                };

        // Student count for each college
        int student_count = 0;
        for(int i = 0; i<colleges.length ; i++){
            student_count = 0;
            for(int j = 0 ; j < students.length ; j++){
                if ( colleges[i].getCol_id() == students[j].getSCollege().getCol_id() ){
                    student_count++;
                }
            }//end of inner loop
            System.out.println("=====================================");
            System.out.println(colleges[i]);
            System.out.println( "Student Count: "+ student_count );
            System.out.println("=====================================");
            System.out.println();
        }//end of outer loop

        // Student details for each college
        for(int i = 0; i<colleges.length ; i++){
            for(int j = 0 ; j < students.length ; j++){
                System.out.println("=====================================");
                System.out.println( students[j]);
                System.out.println("=====================================");
                System.out.println();    
            }//end of inner loop
        }//end of outer loop
    }   
    
}
