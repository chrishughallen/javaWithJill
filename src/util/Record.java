package util;

public class Record {

    public String artist;
    public String albumTitle;
    public int numberOfTracks;
    public int yearReleased;

    public Record(){

    }

    public Record(String artist, String albumTitle, int numberOfTracks, int yearReleased){
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.numberOfTracks = numberOfTracks;
        this.yearReleased = yearReleased;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getAlbumTitle(){
        return this.albumTitle;
    }

    public int getNumberOfTracks(){
        return this.numberOfTracks;
    }

    public int getYearReleased(){
        return this.yearReleased;
    }

    public String getAlbumInfo(){
        return String.format("%s, by %s, was released in the year %s and contains %s tracks.", this.albumTitle,this.artist,this.yearReleased,this.numberOfTracks);
    }


    public static void main(String[] args) {

    }
}
