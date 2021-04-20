public class Main {
    public static void main(String[] args) {

        Albums l1 = new Albums("l1", "Eyes Wide Open", "RnB, Pop", 13);
        Albums l2 = new Albums("l2", "More and more", "Pop", 7);
        Albums l3 = new Albums("l3", "Blackstar", "Rock", 7);
        Albums l4 = new Albums("l4", "What's your pleasure?", "Retro Pop", 12);

        System.out.println("Details of Album with code :  " + l1.getAlbumCode());
        System.out.println(l1.getAlbumName());
        System.out.println(l1.getGenre());
        System.out.println(l1.getTotalSongs());
        System.out.println();

        System.out.println("Details of Album with code :  " + l2.getAlbumCode());
        System.out.println(l2.getAlbumName());
        System.out.println(l2.getGenre());
        System.out.println(l2.getTotalSongs());
        System.out.println();

        System.out.println("Details of Album with code :  " + l3.getAlbumCode());
        System.out.println(l3.getAlbumName());
        System.out.println(l3.getGenre());
        System.out.println(l3.getTotalSongs());
        System.out.println();

        System.out.println("Details of Album with code :  " + l4.getAlbumCode());
        System.out.println(l4.getAlbumName());
        System.out.println(l4.getGenre());
        System.out.println(l4.getTotalSongs());
        System.out.println();

        Artists a1 = new Artists("Twice", "Girl Group", 9);
        Artists a2 = new Artists("David Bowie", "Solo", 1);
        Artists a3 = new Artists("Jessie Ware", "Solo", 1);

        Label b1 = new Label("JYP Entertainment", "Seoul");
        Label b2 = new Label("EMI", "London");
        Label b3 = new Label("Sony", "New York");

        System.out.println("Details of Artist :  " + a1.getArtistsName());
        System.out.println(a1.getArtistsName());
        System.out.println(a1.getType());
        System.out.println(a1.getMembers());
        System.out.println();

        System.out.println("Details of Artist :  " + a2.getArtistsName());
        System.out.println(a2.getArtistsName());
        System.out.println(a2.getType());
        System.out.println(a2.getMembers());
        System.out.println();

        System.out.println("Details of Artist :  " + a3.getArtistsName());
        System.out.println(a3.getArtistsName());
        System.out.println(a3.getType());
        System.out.println(a3.getMembers());
        System.out.println();

        // add artists to album
        a1.addArtistsAlbums(l1);
        a1.addArtistsAlbums(l2);
        a2.addArtistsAlbums(l3);
        a3.addArtistsAlbums(l4);

        // check total album
        System.out.println("Total album of " + a1.getArtistsName() + " is " + a1.getTotalAlbums());
        a1.getAllAlbumsName();
        System.out.println();
        System.out.println("Total album of " + a2.getArtistsName() + " is " + a2.getTotalAlbums());
        a2.getAllAlbumsName();
        System.out.println();
        System.out.println("Total album of " + a3.getArtistsName() + " is " + a3.getTotalAlbums());
        a3.getAllAlbumsName();
        System.out.println();

        // check if an album belong to an Artists
        System.out.print("Is " + l2.getAlbumName() + " an album by " + a1.getArtistsName() + "? ");
        System.out.print(l2.getAlbumName() + a1.isBelongToArtists(l2) + "an album by " + a1.getArtistsName());
        System.out.println();
        System.out.print("Is " + l3.getAlbumName() + " an album by " + a1.getArtistsName() + "? ");
        System.out.print(l3.getAlbumName() + a1.isBelongToArtists(l3) + "an album by " + a1.getArtistsName());
        System.out.println();
        // add artist to label
        b1.addArtistsLabel(a1);
        b2.addArtistsLabel(a2);
        b3.addArtistsLabel(a3);

        // get total artists from label
        System.out.println();
        System.out.println("Total artists of " + b1.getLabelName() + " is " + b1.getTotalArtists());
        b1.getAllArtistsName();
        System.out.println();
        System.out.println("Total artists of " + b2.getLabelName() + " is " + b2.getTotalArtists());
        b2.getAllArtistsName();
        System.out.println();
        System.out.println("Total artists of " + b3.getLabelName() + " is " + b3.getTotalArtists());
        b3.getAllArtistsName();
        System.out.println();
    }
}
