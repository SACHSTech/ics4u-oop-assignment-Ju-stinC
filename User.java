import java.io.*;

public class User {
  
  private String firstName;
  private String lastName;
  private int followingCount;
  private int followerCount;

  SavedSong savedSong;
  SavedPodcast savedPod;
  SavedAlbum savedAlbum;

  public User(SavedSong savedSongg, SavedPodcast savedPodd, SavedAlbum savedAlbumm) {

    savedSong = savedSongg;
    savedPod = savedPodd;
    savedAlbum = savedAlbumm;

  }

  public void setFirstName(String fName) {

    firstName = fName;

  }

  public String getFirstName() {

    return firstName;

  }

  public void setLastName(String lName) {

    lastName = lName;

  }

  public String getLastName() {

    return lastName;

  }

  public void setFollowing(int followingNumber) {

    followingCount = followingNumber;

  }

  public int getFollowing() {

    return followingCount;

  }

  public void setFollowers(int followerNumber) {

    followerCount = followerNumber;

  }

  public int getFollowers() {

    return followerCount;

  }

  public void getAccountDetails() {

    System.out.println();
    System.out.println("Account name: " + firstName + " " + lastName);
    System.out.println("Following: " + followingCount + " accounts");
    System.out.println("Followed by: " + followerCount + " accounts");

  }

}