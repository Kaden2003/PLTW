public class ArrayMediaLib {
    public static void main(String args[]) {

        String[] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
                "Mateo",
                "Sofia" // notice no comma
        };
        for (int i = 0; i < sharingFriends.length; ++i) {
            System.out.println(sharingFriends[i]);
        }


        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        int avg = 0;
        for (int val : daysBtwnPurchase) {
            total = total + val;
        }
        avg = total / daysBtwnPurchase.length;
        System.out.println(avg);
        for (int i = 5; i < daysBtwnPurchase.length; ++i) {
            System.out.println(daysBtwnPurchase[i]);
        }
//-------------song list part IV
        Song[] topTenSongs = new Song[]{
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("How Do I live"),
                new Song("Party Rock Anthem"),
                new Song("I gotta Feeling"),
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")


        };
        int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
        if (index >=0 ) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else System.out.println("Song not found!");

        for (Song s : topTenSongs) {
            System.out.println(s.getTitle());
        }
        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
            System.out.println("Last title: " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }
        int count = 0;
        for (Song s : topTenSongs) {
            if (count % 3 == 0) {
                s.setPrice(.99);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            } else {
                s.setPrice(1.29);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            }
            count++;
        }
            index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
         if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
        }
    }
}
