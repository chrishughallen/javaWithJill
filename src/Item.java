public class Item {

    public int serialNumber;

    public Item(){
        this.serialNumber = (int)Math.floor(Math.random()*1000);
    }


    public static void main(String[] args) {
        Item newItem = new Item();
        System.out.println(newItem.serialNumber);
    }





}
