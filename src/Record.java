public class Record {

    private static String dateFormat;
    public String title;
    public String artist;
    public int releaseYear;
    public int tracks;

    public Record(String title, String artist, int releaseYear, int tracks){
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public static Record[] recordCollection  = new Record[5];

    public String getInfo(){
        return "Title: " + title + "\nArtist: " + artist + "\nRelease Year: " + releaseYear + "\nTracks: " + tracks;
    }


    public static void main(String[] args) {


    }


}
