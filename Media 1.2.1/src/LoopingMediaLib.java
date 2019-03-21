public class LoopingMediaLib {
    public static void main(String args[]){
            //for (int i = 0; i < 10; i++)
            String songInfo = MediaFile.readString();
            System.out.println();

            System.out.println("My favorite songs:");
            while (songInfo != null){
                System.out.println(songInfo);
                songInfo = MediaFile.readString();
                String title = songInfo.substring(0, songInfo.indexOf("|"));
                System.out.println("Title: " + title);
                String rating = songInfo.substring(0, songInfo.indexOf("|"));
                System.out.println("Rating" + rating);
                }

         }

    }

