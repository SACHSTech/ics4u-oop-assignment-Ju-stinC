public class SavedAlbum {

  private int songNumInAlbum;
  private int albumHours;
  private int albumMins;

  SavedSong savedSong;

  public SavedAlbum (SavedSong savedSong1) {

    savedSong = savedSong1;

  }

  public void setSongInAlbumCount(int songsInAlbumCount) {

    songNumInAlbum = songsInAlbumCount;

  }

  public int getSongInAlbumCount() {

    return songNumInAlbum;

  }

  public void setAlbumHoursCount(int albumHoursCount) {

    albumHours = albumHoursCount;

  }

  public int getAlbumHoursCount() {

    return albumHours;

  }

  public void setAlbumMinsCount(int albumMinsCount) {

    albumMins = albumMinsCount;

  }

  public int getAlbumMinsCount() {

    return albumMins;

  }

}