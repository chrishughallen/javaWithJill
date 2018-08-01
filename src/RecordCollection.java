import util.Record;

public class RecordCollection extends Record {

    public static void main(String[] args) {
        Record[] recordCollection = new Record[5];
        Record zep = new Record("Led Zeppelin", "Led Zeppelin 4",11, 1977);
        Record acdc = new Record("AC/DC", "Hells Bells", 9,1975);
        Record sabbath = new Record("Black Sabbath", "Black Sabbath", 10, 1972);
        Record maiden = new Record("Iron Maiden", "The Number Of The Beast", 12, 1981);
        Record metallica = new Record("Metalica", "Kill Em' All", 10, 1983);
        recordCollection[0] = zep;;
        recordCollection[1] = acdc;
        recordCollection[2] = sabbath;
        recordCollection[3] = maiden;
        recordCollection[4] = metallica;

        for (Record record : recordCollection){
            System.out.println(record.getAlbumInfo());
        }
    }



}
