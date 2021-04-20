import java.util.ArrayList;

public class Label {
    private String labelName;
    private String labelBased;
    private ArrayList<Artists> artistsLabel;

    public Label(String labelName, String labelBased) {
        this.labelName = labelName;
        this.labelBased = labelBased;
        this.artistsLabel = new ArrayList<Artists>();
    }

    // getters
    public String getLabelName() {
        return this.labelName;
    }

    public String getLabelBased() {
        return this.labelBased;
    }

    // set artists to label
    public void addArtistsLabel(Artists a) {
        this.artistsLabel.add(a);
    }

    // get total artists per label
    public int getTotalArtists() {
        return this.artistsLabel.size();
    }

    // get all artists name per label
    public void getAllArtistsName() {
        System.out.print(this.labelName + " artists are: ");
        for (int j = 0; j < artistsLabel.size(); j++) {
            Artists m = artistsLabel.get(j);

            System.out.print(m.getArtistsName() + ", ");
        }
        System.out.println();
    }
}
