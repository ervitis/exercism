import java.util.StringJoiner;

class House {
    private final String[] lines = {
            "This is the horse and the hound and the horn ",
            "that belonged to the farmer sowing his corn ",
            "that kept the rooster that crowed in the morn ",
            "that woke the priest all shaven and shorn ",
            "that married the man all tattered and torn ",
            "that kissed the maiden all forlorn ",
            "that milked the cow with the crumpled horn ",
            "that tossed the dog ",
            "that worried the cat ",
            "that killed the rat ",
            "that ate the malt ",
            "that lay in the house that Jack built."
    };

    public String verse(int numberVerse) {
        StringBuilder sb = new StringBuilder();
        int f = lines.length - numberVerse;

        for (int i = f; i < lines.length; i++) {
            String verseLine;
            if (i == f) {
                String firstLine = lines[i].split(" the ", 2)[1];
                verseLine = "This is the " + firstLine;
            } else {
                verseLine = lines[i];
            }
            sb.append(verseLine);
        }
        return sb.toString();
    }

    public String verses(int start, int end) {
        StringJoiner join = new StringJoiner("\n");
        for (int i = start; i <= end; i++) {
            join.add(this.verse(i));
        }
        return join.toString();
    }

    public String sing() {
        return this.verses(1, lines.length);
    }
}