
import dsacoursework.Tracks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carl Bengtsson
 */
public class TracksTest {
    
    
    public static void main(String[] args) {
    Tracks track1 = new Tracks();
    Tracks track2 = new Tracks(2, "Track2", "Artist2", 234, "Composer2", "15-04-2017", "Album2", "Genre2");
    
    track1.setTrackID(1);
    track1.setTrackTitle("Track1");
    track1.setArtist("Artist1");
    track1.setTrackLength(123);
    track1.setComposer("Composer1");
    track1.setReleaseDate("05-12-2019");
    track1.setAlbum("Album1");
    track1.setGenre("genre1");
    
    System.out.println("Track ID: " + track1.getTrackID());
    System.out.println("Track Title: " + track1.getTrackTitle());
    System.out.println("Artist: " + track1.getArtist());
    System.out.println("Track Length: " + track1.getTrackLength()/60 + " Minutes " + track1.getTrackLength()%60 + " Seconds");
    System.out.println("Composer: " + track1.getComposer());
    System.out.println("Release Date: " + track1.getReleaseDate());
    System.out.println("Album: " + track1.getAlbum());
    System.out.println("Genre: " + track1.getGenre());
    
    System.out.println(track2.toString());
    }
}
