// @author : Pritam Chakraborty
// @date : 28/07/2021
package CollegeTest.college;

public class College {

    private String col_name_ = null;
    private String col_id_ = null;

    public College() {
    }

    public College(String col_name, String col_id) {
        col_name_ = col_name;
        col_id_ = col_id;
    }

    public String getCol_name() {
        return col_name_;
    }

    public String getCol_id() {
        return col_id_;
    }

    @Override
    public String toString() {
        return "College [col_id_=" + col_id_ + ", col_name_=" + col_name_ + "]";
    }

}
