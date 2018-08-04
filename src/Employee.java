public class Employee extends Department{

    public String first_name;
    public String last_name;
    public int hire_year;
    public Department department;
    public double salary;
    public boolean isManager;

    public Employee(){

    }

    public Employee(String first_name, String last_name, Department department, int hire_year, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.department = department;
        this.hire_year = hire_year;
        this.salary = salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getHire_year() {
        return hire_year;
    }

    public void setHire_year(int hire_year) {
        this.hire_year = hire_year;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeDetails(){
        return first_name + " " + last_name + " is in the " + department.getDepartment() + " department where the job is " + department.getJob_description()
                + ". " + first_name + " has been with the company since " + hire_year + " and gets paid $" + salary + " per year.";
    }







    public static void main(String[] args) {

        Department sales = new Department("Sales", "Selling Stuff");
        Department it = new Department("IT", "Fixing technical issues");
        Department design = new Department("Design", "Designing things");
        Department marketing = new Department("Marketing", "Creating marketing materials");
        Department research = new Department("Research", "Conducting Research");

        Employee emp1 = new Employee("Chris", "Allen", sales, 2016, 55000);
        Employee emp2 = new Employee("Dave", "Thomas", design, 2006, 105000);
        Employee emp3 = new Employee("Robert", "Plant", marketing, 2000, 85000);
        Employee emp4 = new Employee("Jesse", "Pinkman", research, 2016, 25000);
        Employee emp5 = new Employee("Saul", "Goodman", it, 2016, 95000);

        Employee[] employees = new Employee[5];
        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;


        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeDetails());
        }



    }
}
