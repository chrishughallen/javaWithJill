package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(){

    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer>getGrades(){
        return this.grades;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int average = 0;
        for (Integer grade : grades) {
            average += grade;
        }
        return average/grades.size();
    }





    public static void main(String[] args) {
        Student chris = new Student("chris");
        chris.addGrade(98);
        chris.addGrade(72);
        chris.addGrade(81);
        chris.addGrade(100);
        chris.addGrade(89);
        System.out.println(chris.getGradeAverage());
    }

}