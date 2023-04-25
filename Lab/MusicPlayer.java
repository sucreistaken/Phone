public class MusicPlayer implements Playable {
    private String artistName;
    private String albumName;
    private String songName;
    private  double songDuration;
    private int volumeLevel;

    public MusicPlayer(String artistName, String albumName, String songName, double songDuration, int volumeLevel) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.songName = songName;
        this.songDuration = songDuration;
        this.volumeLevel = volumeLevel;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {

    }

    @Override
    public void prev() {

    }
}
