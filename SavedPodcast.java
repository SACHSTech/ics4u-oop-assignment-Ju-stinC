import java.io.*;

public class SavedPodcast extends SavedSong {

  private int episodeCount;
  private String podcastDescription;

  public void setEpisodeCount(int numberOfEpisodes) {

    episodeCount = numberOfEpisodes;

  }

  public int getEpisodeCount() {

    return episodeCount;

  }

  public void setPodcastDescription(String podDescription) {

    podcastDescription = podDescription;

  }

  public String getPodcastDescription() {

    return podcastDescription;

  }

}