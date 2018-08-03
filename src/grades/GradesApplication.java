package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication extends Input {

    public static Input input = new Input();


    public static void gradingApp(HashMap<String,Student> students){
        System.out.println("Welcome, here are the github usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("Enter a username to see more information about that user.");
        System.out.println("Enter \"all\" to see all the students information");
        System.out.println("Enter \"overall\" to see the overall grade average of the students.");
        String userChoice = input.getString();
        if(userChoice.equalsIgnoreCase("all")) {
            for (String student : students.keySet()) {
                System.out.println("Name: " + students.get(student).getName());
                System.out.println("Grades: " + students.get(student).getGrades());
                System.out.printf("Average: " + students.get(student).getGradeAverage());
                System.out.println("\n********************\n");
            }
        }else if(userChoice.equalsIgnoreCase("overall")){
            double total = 0;
            for(String student : students.keySet()){
                total += students.get(student).getGradeAverage();

            }
            total /= students.size();
            System.out.println("The overall grade average for the class is " + total);
        }
        else if(students.containsKey(userChoice)) {
            String name = students.get(userChoice).getName();
            double gradeAverage = students.get(userChoice).getGradeAverage();
            ArrayList<Integer> grades = students.get(userChoice).getGrades();
            System.out.printf("Name:%s\nGrades:%s\nCurrent Average:%s\n", name,grades,gradeAverage);
        } else System.out.println("No user found with username " + userChoice + ".");
        if(input.yesNo("Continue? [y,n]")){
             gradingApp(students);
        }else System.out.println("Thanks for using The Grading App!");
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jill = new Student("Jill");
        Student alex = new Student("Alex");
        Student bob = new Student("Bob");
        Student jessica = new Student("Jessica");

        jill.addGrade(81);
        jill.addGrade(89);
        jill.addGrade(98);
        jill.addGrade(100);

        alex.addGrade(88);
        alex.addGrade(82);
        alex.addGrade(98);
        alex.addGrade(99);

        bob.addGrade(22);
        bob.addGrade(61);
        bob.addGrade(50);
        bob.addGrade(34);

        jessica.addGrade(80);
        jessica.addGrade(93);
        jessica.addGrade(91);
        jessica.addGrade(72);

        students.put("JAVAjill", jill);
        students.put("alexandra.zk", alex);
        students.put("billy_bob", bob);
        students.put("j-dog", jessica);


//    gradingApp(students);

        Student test = jill;

        System.out.println(students.keySet().toString());

    }
}
