public class Algorithms {
    public static void main(String args[]) {
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
    }
}
