import java.io.*;

public class SavedSong {

  private String artist;
  private int length;
  private int playsCount;
  private String title;
  private boolean isClean = true;
  private int releaseYear;
  private String artistFeature;
  private String songChoice;
  private String featArtist;

  public void setSongChoice(String songYesOrNo) {

    songChoice = songYesOrNo;
  
  }

  public String getSongChoice() {

    return songChoice;

  }

  public void setArtist(String mainArtist) {

    artist = mainArtist;

  }

  public String getArtist() {

    return artist;

  }

  public void setSongTitle(String songTitle) {

    title = songTitle;

  }

  public String getSongTitle() {

    return title;

  }

  public void setSongLength(int songLength) {

    length = songLength;

  }

  public int getSongLength() {

    return length;

  }

  public void setPlaysCount(int playsNumber) {

    playsCount = playsNumber;

  }

  public int getPlaysCount() {

    return playsCount;

  }

  public void setClean(String cleanChoice, boolean cleanCheck) {

    if(cleanChoice.equalsIgnoreCase("n")) {

      cleanCheck = false;

      isClean = cleanCheck;

    }

  }

  public boolean getClean() {

    return isClean;

  }

  public void setReleaseYear(int yearOfRelease) {

    releaseYear = yearOfRelease;

  }

  public int getReleaseYear() {

    return releaseYear;

  }

  public void setArtistFeature(String featuredArtist) {

    if(featuredArtist.equalsIgnoreCase("n")) {

      featuredArtist = "none";

    }

    artistFeature = featuredArtist;

  }

  public String getArtistFeature() {

    return artistFeature;

  }

  public void setFeature(String featuredArtist) {

    featArtist = featuredArtist;

  }

  public String getFeature() {

    return featArtist;

  }

  public void getSongDetails() {

    System.out.println();
    System.out.println("Artist: " + artist);
    System.out.println("Song length: " + length + " seconds");
    System.out.println("Number of plays: " + playsCount);
    System.out.println("Clean?: " + isClean);
    System.out.println("Release Year: " + releaseYear);
    System.out.println("Artist feature: " + featArtist);

  }

}