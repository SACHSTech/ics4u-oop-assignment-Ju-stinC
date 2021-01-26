import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    SavedSong s = new SavedSong();
    SavedPodcast p = new SavedPodcast(); 
    SavedAlbum a = new SavedAlbum(s);
    User u = new User(s, p, a);

    System.out.println("Welcome to Spotify!");
    System.out.println();

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

    System.out.print("Space on this account is limited, meaning you can only save one (1) song, podcast, and album.");
    System.out.println();
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

    System.out.print("Would you like to save an album? (y for yes/n for no): ");
    s.setChoice(keyboard.readLine());

    if(s.getChoice().equals("y")) {

      System.out.print("Enter the name of the album: ");
      s.setName(keyboard.readLine());

      System.out.print("Enter the artist of this album: ");
      s.setArtist(keyboard.readLine());

      System.out.print("How many songs are in this album?: ");
      a.setSongInAlbumCount(Integer.parseInt(keyboard.readLine()));

      System.out.print("How long is this album? (in hours): ");
      a.setAlbumHoursCount(Integer.parseInt(keyboard.readLine()));

      System.out.print("How long is this album? (in minutes): ");
      a.setAlbumMinsCount(Integer.parseInt(keyboard.readLine()));

      System.out.print("What year did this album release?: ");
      s.setReleaseYear(Integer.parseInt(keyboard.readLine()));

      System.out.println();
      System.out.println("These are the details of the album you saved: ");
      System.out.println();

      System.out.println("Album name: " + s.name);
      System.out.println("Artist/Creator: " + s.artist);
      System.out.println("Amount of songs in this album: " + a.getSongInAlbumCount());
      System.out.println("Hours in album: " + a.getAlbumHoursCount());
      System.out.println("Minutes in album: " + a.getAlbumMinsCount());
      System.out.println("Release Year: " + s.releaseYear);    
      System.out.println();

      System.out.print("Thanks for using Spotify.");

    }

  System.out.print("Thanks for using Spotify.");

  }

}
