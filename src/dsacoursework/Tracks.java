/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;


/**
 *
 * @author Carl Bengtsson
 */
public class Tracks {
    private int trackID;
    private String trackTitle;
    private String artist;
    private int trackLength;
    private String composer;
    private String releaseDate;
    private String album;
    private String genre;
    
    
    public Tracks(){
        
    }
    
    public Tracks(int trackID, String trackTitle, String artist, int trackLength, String composer, String releaseDate, String album, String genre) {
        this.trackID=trackID;
        this.trackTitle=trackTitle;
        this.artist=artist;
        this.trackLength=trackLength;
        this.composer=composer;
        this.releaseDate=releaseDate;
        this.album=album;
        this.genre=genre;
    }
    
    public void setTrackID(int trackID) {
        this.trackID=trackID;
    }
    public int getTrackID() {
        return this.trackID;
    }
    
    public void setTrackTitle(String trackTitle) {
        this.trackTitle=trackTitle;
    }
    public String getTrackTitle() {
        return this.trackTitle;
    }
    
    public void setArtist(String artist) {
        this.artist=artist;
    }
    public String getArtist() {
        return this.artist;
    }
    
    public void setTrackLength(int trackLength) {
        this.trackLength=trackLength;
    }
    public int getTrackLength() {
        return this.trackLength;
    }
    
    public void setComposer(String composer) {
        this.composer=composer;
    }
    public String getComposer() {
        return this.composer;
    }
    
    public void setReleaseDate(String releaseDate) {
        this.releaseDate=releaseDate;
    }
    public String getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setAlbum(String album) {
        this.album=album;
    }
    public String getAlbum() {
        return this.album;
    }
    
    public void setGenre(String genre) {
        this.genre=genre;
    }
    public String getGenre() {
        return this.genre;
    }
    
    
    @Override
    public String toString() {
        return  "\nTrack ID: " + this.trackID + 
                "\nTrack Title: " + this.trackTitle + 
                "\nArtist: " + this.artist +
                "\nTrack Length: " + this.trackLength/60 + " Minutes " + this.trackLength%60 + " Seconds" +
                "\nComposer: " + this.composer +
                "\nRelease Date: " + this.releaseDate +
                "\nAlbum: " + this.album +
                "\nGenre: " + this.genre;
    }
}
