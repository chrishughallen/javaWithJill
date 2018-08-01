public class TenFunctions {

    public Boolean isTrue(Boolean userInput){
        return userInput;
    }

    public static String myName = "chris";

    public static int countA(String word){
        int count = 0;
        for(int i = 0;i<word.length();i++){
            Character currentLetter = word.charAt(i);
            String letter = currentLetter.toString();
            if(letter.equalsIgnoreCase("a")||letter.equalsIgnoreCase("e")
            ||letter.equalsIgnoreCase("i")|| letter.equalsIgnoreCase("o")||
                    letter.equalsIgnoreCase("u")){
                    count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countA("christopher"));
        System.out.println(countA("tazmania"));
        int a = 5;
        System.out.println(a>2 ? a<4 ? 10:8:7);
    }
}