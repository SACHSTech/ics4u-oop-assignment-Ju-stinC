import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException{

    User u = new User();
    SavedSong s = new SavedSong();

    System.out.println("Welcome to Spotify!");

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter your first name for your account: ");
    u.setFirstName(keyboard.readLine());
    System.out.print("Now enter your last name: ");
    u.setLastName(keyboard.readLine());

    System.out.print("How many accounts do you want to follow?: ");
    u.setFollowing(Integer.parseInt(keyboard.readLine()));
    System.out.print("How many followers do you have?: ");
    u.setFollowers(Integer.parseInt(keyboard.readLine()));
    System.out.println();

    System.out.println("These are the details of your account: ");
    u.getAccountDetails();
    System.out.println();

    System.out.print("Would you like to save a song? (y for yes/n for no): ");
    s.setSongChoice(keyboard.readLine());

    if(s.getSongChoice().equals("y")) {

      System.out.print("Enter the name of the artist: ");
      s.setArtist(keyboard.readLine());

      System.out.print("Enter the title of the song you want to save: ");
      s.setSongTitle(keyboard.readLine());

      System.out.print("Enter the length of this song (in seconds): ");
      s.setSongLength(Integer.parseInt(keyboard.readLine()));

      System.out.print("How many plays does this song have?: ");
      s.setPlaysCount(Integer.parseInt(keyboard.readLine()));

      System.out.print("Is this song clean? (no swearing/profanities) (y for yes/n for no): ");
      s.setClean(keyboard.readLine(), true);

      System.out.print("Enter the year of release: ");
      s.setReleaseYear(Integer.parseInt(keyboard.readLine()));

      System.out.print("Is another artist featured on this song? (y for yes/n for no): ");
      s.setArtistFeature(keyboard.readLine());

      if(s.getArtistFeature().equals("y")) {

        System.out.print("Enter the name of the featured artist: ");
        s.setFeature(keyboard.readLine());

      }else {

        s.setFeature("none");

      }

      System.out.println();
      System.out.println("These are the details of the song you saved: ");
      s.getSongDetails();
      System.out.println();

    }

  }

}