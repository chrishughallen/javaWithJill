public class ServerNameGenerator {

    public static String[] nouns = {"Pirate", "San Antonio", "Refrigerator", "Honda Civic",
    "Minivan", "Coffee", "Glass Bottle", "Smartphone", "Apartment Complex"};

    public static String[] adjectives = {"Lovely", "Annoying", "Stupid", "Beautiful", "Obnoxious", "Low Level", "Gigantic", "Fast Moving", "Slow", "Wondeful"};

    public static String getRandomString(String [] array){
        return array[(int)Math.floor(Math.random()*array.length)];
    }

    public static String generateServerName(){
        return getRandomString(adjectives) + " " + getRandomString(nouns);
    }

    public static void main(String[] args) {
        System.out.println(generateServerName());
    }






}
