public class Albums {
    private String albumCode;
    private String albumName;
    private String genre;
    private int totalSongs;

    public Albums(String albumCode, String albumName, String genre, int totalSongs) {
        this.albumCode = albumCode;
        this.albumName = albumName;
        this.genre = genre;
        this.totalSongs = totalSongs;
    }

    // getters
    public String getAlbumCode() {
        return this.albumCode;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getTotalSongs() {
        return this.totalSongs;
    }

    // setters
    public void setGenre(String a) {
        this.genre = a;

    }

}
