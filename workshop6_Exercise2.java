public class workshop6_Exercise2 {
    public static void main(String[] args) {
        String[] songs = {
            "Anti-Hero",
            "Cruel Summer",
            "Love Story",
            "Blank Space",
            "Summertime Sadness",
            "Young and Beautiful",
            "Video Games",
            "Ocean Eyes",
            "Bad Guy",
            "What Was I Made For?"
        };

        String[] artists = {
            "Taylor Swift",
            "Taylor Swift",
            "Taylor Swift",
            "Taylor Swift",
            "Lana Del Rey",
            "Lana Del Rey",
            "Lana Del Rey",
            "Billie Eilish",
            "Billie Eilish",
            "Billie Eilish"
        };

        // Bubble sort: sort song names and keep each artist with the song.
        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs.length - 1 - i; j++) {
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {
                    String tempSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tempSong;

                    String tempArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tempArtist;
                }
            }
        }

        System.out.println("Songs in Alphabetical Order:");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
