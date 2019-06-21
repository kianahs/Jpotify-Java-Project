package Logic;
import Logic.Song;
import javazoom.jl.decoder.JavaLayerException;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Library {

    private String libraryName;
    private String userName;
    private ArrayList<Song> allSongs;
    private ArrayList<String> allSongsPath;
    private ArrayList<Album> allAlbums;
    private ArrayList<Playlist> allPlayLists;


    public Library(String libraryName, String userName) {

        this.libraryName = libraryName;
        this.userName = userName;
        allSongs =  new ArrayList<>();
        allAlbums = new ArrayList<>();
        allSongsPath=new ArrayList<>();
    }

    public void  importSongsPathToLibraryFromPc(String pathName) throws IOException, JavaLayerException {

        File f= new File(pathName);

        File[] allFiles=f.listFiles();

        for (File x : allFiles) {

            allSongsPath.add(x.getPath());

        }

        for (String s:allSongsPath) {

            Song song= null;
            try {
                song = new Song(s);
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            }
            allSongs.add(song);

        }

    }

    public ArrayList<String> getAllSongsPath() {
        return allSongsPath;
    }

    public ArrayList<Song> getAllSongs() {
        return allSongs;
    }

    public ArrayList<Album> getAllAlbums() {
        return allAlbums;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void makeAlbums(){

        for (Song s: allSongs) {

            Album album=new Album( s.getAlbumName(),s.getArtist(),s.getImage());

                for (Song song:allSongs) {

                    if(song.getAlbumName().equals(album.getAlbumName())){

                        album.getAlbumSongs().add(song);

                    }
            }

            allAlbums.add(album);
        }

    }
}
