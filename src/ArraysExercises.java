import java.util.Arrays;

public class ArraysExercises {

    public static void sayWord(String word){

    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        String[] languages = new String[5];

        languages[1] = "html";
        languages[2] = "css";






        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("David");
        Person person2 = new Person("Alexandra");
        Person person3 = new Person("Ben");


        Person[] people = {person1, person2, person3};

        for(Person person: people){
            System.out.println(person.getName());
        }

    }
}
