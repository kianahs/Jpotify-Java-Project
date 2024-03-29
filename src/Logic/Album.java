package Logic;
import java.util.ArrayList;

public class Album implements Sort {

    private String albumName;
    private String artist;
    private ArrayList<Song> albumSongs;
    private byte[] albumArtwork;
    private SongComparator songComparator;


    public Album(String albumName , String artist ,  byte[] albumArtwork ){
        ///mire az kole song ha ke esme albumeshoon yekie peida mikone mirize too list ye album misaze

        this.albumName=albumName;
        this.artist=artist;
        albumSongs=new ArrayList<>();
        this.albumArtwork=albumArtwork;
        songComparator=new SongComparator();
    }


    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }


    public byte[] getAlbumArtwork() {
        return albumArtwork;
    }

    @Override
    public void sortSongs() {

        albumSongs.sort(songComparator);

    }
}
