import java.util.Scanner;

public class Employee {

    public static Scanner scanner = new Scanner(System.in);

    public String name;
    public int employeeNumber;
    public int age;
    public boolean isManager;

    public Employee(){

    }

    public Employee(String name, int age, boolean isManager){
        this.name = name;
        this.employeeNumber = (int)Math.ceil(Math.random()*1000) + 100000;
        this.age = age;
        this.isManager = isManager;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(){
        this.employeeNumber = (int)Math.ceil(Math.random()*100) + 100000;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isEligibleForRetirement(){
        return this.age>=65;
    }

    public String getEmployeeInfo(){

        System.out.println("Name: " + this.getName());
        System.out.println("Employee Number: " + this.getEmployeeNumber());
        System.out.println("Age: " + this.getAge());
        System.out.println("Is manager: " + this.isManager());
        return "---";
    }

    public static void manualEntryOfNewEmployee(){
        Employee newEmployee = new Employee();
        System.out.println("Enter the name of the new employee");
        newEmployee.setName(scanner.nextLine());
        System.out.println("How old is " + newEmployee.getName());
        newEmployee.setAge(scanner.nextInt());
        System.out.printf("Is %s a manager? Enter true or false \n", newEmployee.getName());
        newEmployee.setManager(scanner.nextBoolean());
        newEmployee.setEmployeeNumber();
        System.out.println(newEmployee.getEmployeeInfo());

    }

    public static void main(String[] args) {
        Employee chris = new Employee("Chris Allen", 29, false);
        Employee alex = new Employee("Alexandra Zaika", 27, true);
        Employee lawrence = new Employee("Lawrence Allen", 74,true);

        manualEntryOfNewEmployee();
    }
}
