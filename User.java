import java.io.*;

public class User {
  
  private String firstName;
  private String lastName;
  private int followingCount;
  private int followerCount;

  SavedSong savedSong;
  SavedPodcast savedPod;
  SavedAlbum savedAlbum;

  /**
  * Constructor for giving the user the objects that they will need
  * @param SavedSong - the user may need a savedsong
  * @param SavedPodcast - the user may need a savedpodcast
  * @param SavedAlbum - the user may need a savevdalbum
  */

  public User(SavedSong savedSongg, SavedPodcast savedPodd, SavedAlbum savedAlbumm) {

    savedSong = savedSongg;
    savedPod = savedPodd;
    savedAlbum = savedAlbumm;

  }

  /**
  * @param fName for the user account first name
  */

  public void setFirstName(String fName) {

    firstName = fName;

  }

  /**
  * @return firstName for what they entered as their first name
  */

  public String getFirstName() {

    return firstName;

  }

  /**
  * @param lName for the user account last name
  */

  public void setLastName(String lName) {

    lastName = lName;

  }

  /**
  * @return lastName for what they entered as their last name
  */

  public String getLastName() {

    return lastName;

  }

  /**
  * @param followingNumber which is the number of accounts they want to follow
  */

  public void setFollowing(int followingNumber) {

    followingCount = followingNumber;

  }

  /**
  * @return followingCount which is the number of accounts they want to follow
  */

  public int getFollowing() {

    return followingCount;

  }

  /**
  * @param followerNumber which is the number of accounts they want to be followed by
  */

  public void setFollowers(int followerNumber) {

    followerCount = followerNumber;

  }

  /**
  * @return followerCount which is the number of accounts they want to be followed by
  */

  public int getFollowers() {

    return followerCount;

  }

  /** 
  * after they enter their details, this method will print them
  */

  public void getAccountDetails() {

    System.out.println();
    System.out.println("Account name: " + firstName + " " + lastName);
    System.out.println("Following: " + followingCount + " accounts");
    System.out.println("Followed by: " + followerCount + " accounts");

  }

}