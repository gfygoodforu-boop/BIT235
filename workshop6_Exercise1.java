public class workshop6_Exercise1 {
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

        System.out.println("My 10 Favorite Songs:");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
