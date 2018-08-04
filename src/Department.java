public class Department  {


    public String department;
    public String job_description;

    public Department(){}

    public Department(String department, String job_description){
        this.department = department;
        this.job_description = job_description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

}
