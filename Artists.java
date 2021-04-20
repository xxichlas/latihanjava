import java.util.ArrayList;

public class Artists {
    private String artistsName;
    private String type;
    private int members;
    private ArrayList<Albums> artistsAlbums;

    public Artists(String artistsName, String type, int members) {
        this.artistsName = artistsName;
        this.type = type;
        this.members = members;
        this.artistsAlbums = new ArrayList<Albums>();
    }

    // getters
    public String getArtistsName() {
        return this.artistsName;
    }

    public String getType() {
        return this.type;
    }

    public int getMembers() {
        return this.members;
    }

    // set artists to albums
    public void addArtistsAlbums(Albums a) {
        this.artistsAlbums.add(a);

    }

    // get total albums per artists
    public int getTotalAlbums() {
        return this.artistsAlbums.size();
    }

    // get all albums name per artists
    public void getAllAlbumsName() {
        System.out.print(this.artistsName + " albums are: ");
        for (int j = 0; j < artistsAlbums.size(); j++) {
            Albums m = artistsAlbums.get(j);

            System.out.print(m.getAlbumName() + ", ");
        }
        System.out.println();
    }

    // check if an album belong to a spesific artists
    public String isBelongToArtists(Albums a) {
        boolean result = false;
        String output = "";

        for (int i = 0; i < artistsAlbums.size(); i++) {
            Albums m = artistsAlbums.get(i);
            if (a.getAlbumCode().equals(m.getAlbumCode())) {
                result = true;
                break;
            }
        }
        if (result == true) {
            output = " is ";
        } else if (result == false) {
            output = " is not ";
        }
        return output;
    }

}