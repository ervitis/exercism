import java.util.*;

class Scrabble {

    final Map<Integer, List<String>> scores = new HashMap<>(Map.ofEntries(
       Map.entry(1, List.of("A", "E", "I", "O", "U", "L", "N", "R", "S", "T")),
       Map.entry(2, List.of("D", "G")),
       Map.entry(3, List.of("B", "C", "M", "P")),
       Map.entry(4, List.of("F", "H", "V", "W", "Y")),
       Map.entry(5, List.of("K")),
       Map.entry(8, List.of("J", "X")),
       Map.entry(10, List.of("Q", "Z"))
    ));
    int points;

    Scrabble(String word) {
        this.points = 0;

        if (word.trim().isBlank()) {
            return;
        }

        Arrays.stream(word.toUpperCase(Locale.ROOT).split("")).forEach(e -> {
            this.scores.forEach((key, value) -> {
                if (value.contains(e)) {
                    this.points += key;
                }
            });
        });
    }

    int getScore() {
        return this.points;
    }

}
