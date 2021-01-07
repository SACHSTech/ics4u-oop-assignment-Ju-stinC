import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException{

    User u = new User();
    SavedSong s = new SavedSong();
    SavedPodcast p = new SavedPodcast();

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
    s.setChoice(keyboard.readLine());

    if(s.getChoice().equals("y")) {

      System.out.print("Enter the name of the artist: ");
      s.setArtist(keyboard.readLine());

      System.out.print("Enter the name of the song you want to save: ");
      s.setName(keyboard.readLine());

      System.out.print("Enter the length of this song (in seconds): ");
      s.setLength(Integer.parseInt(keyboard.readLine()));

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

    System.out.print("Would you like to save a podcast? (y for yes/n for no): ");
    p.setChoice(keyboard.readLine());

    if(p.getChoice().equals("y")) {

      System.out.print("Enter the name of the podcast: ");
      p.setName(keyboard.readLine());

      System.out.print("Enter the creator of this podcast: ");
      p.setArtist(keyboard.readLine());

      System.out.print("How many episodes are in this podcast?: ");
      p.setEpisodeCount(Integer.parseInt(keyboard.readLine()));

      System.out.print("Enter the average length of an episode (in minutes): ");
      p.setLength(Integer.parseInt(keyboard.readLine()));

      System.out.print("Enter a brief description of this podcast: ");
      p.setPodcastDescription(keyboard.readLine());

      System.out.print("What year did this podcast start/release?: ");
      p.setReleaseYear(Integer.parseInt(keyboard.readLine()));

    }

    System.out.println();
    System.out.println("These are the details of the podcast you saved: ");
    System.out.println();

    System.out.println("Podcast name: " + p.name);
    System.out.println("Artist/Creator: " + p.artist);
    System.out.println("Amount of episodes: " + p.getEpisodeCount());
    System.out.println("Average length of an episode: " + p.length);
    System.out.println("Desciription: " + p.getPodcastDescription());
    System.out.println("Release Year: " + p.releaseYear);    
    System.out.println();

  }

}