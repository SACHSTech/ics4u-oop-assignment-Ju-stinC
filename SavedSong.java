import java.io.*;

public class SavedSong {

  public String artist;
  public int length;
  private int playsCount;
  public String name;
  private boolean isClean = true;
  public int releaseYear;
  private String artistFeature;
  private String choice;
  private String featArtist;

  /**
  * @param yesOrNo which will take in y or n for whether or not they want to add a song, podcast, or album
  * this is used many times throughout the program
  */

  public void setChoice(String yesOrNo) {

    choice = yesOrNo;
  
  }

  /** 
  * @return choice which returns whichever choice they chose
  */

  public String getChoice() {

    return choice;

  }

  /** 
  * @param mainArtist which is the main artist who sings the song
  */

  public void setArtist(String mainArtist) {

    artist = mainArtist;

  }

  /**
  * @return artist
  */ 

  public String getArtist() {

    return artist;

  }

  public void setName(String songName) {

    name = songName;

  }

  public String getName() {

    return name;

  }

  public void setLength(int songLength) {

    length = songLength;

  }

  public int getLength() {

    return length;

  }

  public void setPlaysCount(int playsNumber) {

    playsCount = playsNumber;

  }

  public int getPlaysCount() {

    return playsCount;

  }

  /** 
  * @param cleanChoice - is the song clean or not(y or n)
  * @param cleanCheck - based on what they said changes this value. if y it will stay true, if n it will change to false
  */

  public void setClean(String cleanChoice, boolean cleanCheck) {

    if(cleanChoice.equalsIgnoreCase("n")) {

      cleanCheck = false;

      isClean = cleanCheck;

    }

  }

  /**
  * @return isClean - true or false 
  */

  public boolean getClean() {

    return isClean;

  }

  public void setReleaseYear(int yearOfRelease) {

    releaseYear = yearOfRelease;

  }

  public int getReleaseYear() {

    return releaseYear;

  }

  /**
  * @param featuredArtist - is there a featured artist: y or n
  * if there is, skip this but if there isn't then the featured artist will be displayed as "none" at the end
  */

  public void setArtistFeature(String featuredArtist) {

    if(featuredArtist.equalsIgnoreCase("n")) {

      featuredArtist = "none";

    }

    artistFeature = featuredArtist;

  }

  /** 
  * @return artistFeature - whether or not there is a feature
  */

  public String getArtistFeature() {

    return artistFeature;

  }

  public void setFeature(String featuredArtist) {

    featArtist = featuredArtist;

  }

  public String getFeature() {

    return featArtist;

  }

  /**
  * print the details of the song that the user just entered
  */

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