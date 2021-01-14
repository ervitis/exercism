import java.text.MessageFormat;

class BeerSong {
    static final String noMoreBeers = "No more bottles of beer on the wall, no more bottles of beer.\n";
    static final String buyMore = "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
    static final String lineSong = "%s of beer on the wall, %s of beer.\nTake one down and pass it around, %s bottles of beer on the wall.\n\n";


    String sing(int bottles, int nLines) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= nLines; i++) {
            sb.append(this.getFirstVerse(bottles));
            sb.append(this.getSecondVerse(bottles));
            bottles--;
        }

        return sb.toString();
    }

    private String getFirstVerse(int bottleAmount) {
        switch (bottleAmount) {
            case 0:
                return "No more bottles of beer on the wall, no more bottles of beer.\n";
            case 1:
                return MessageFormat.format("{0} bottle of beer on the wall, {0} bottle of beer.\n", bottleAmount);
            default:
                return MessageFormat.format("{0} bottles of beer on the wall, {0} bottles of beer.\n", bottleAmount);
        }
    }

    private String getSecondVerse(int bottleAmount) {
        switch (bottleAmount) {
            case 0:
                return "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
            case 1:
                return "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
            case 2:
                return MessageFormat.format("Take one down and pass it around, {0} bottle of beer on the wall.\n\n", bottleAmount - 1);
            default:
                return MessageFormat.format("Take one down and pass it around, {0} bottles of beer on the wall.\n\n", bottleAmount - 1);
        }
    }

    String singSong() {
        return this.sing(99, 100);
    }
}