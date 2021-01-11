import java.util.*;

class IsogramChecker {

    private Map<String, Integer> isogram;

    public IsogramChecker() {
        this.isogram = new HashMap<>();
    }

    boolean isIsogram(String phrase) {

        if (phrase.isEmpty()) {
            return true;
        }

        phrase = phrase.toUpperCase(Locale.ROOT);
        Arrays.stream(phrase.split("")).forEach(e -> {
            if (e.matches("\\w")) {
                if (!this.isogram.containsKey(e)) {
                    this.isogram.put(e, 1);
                } else {
                    this.isogram.put(e, this.isogram.get(e) + 1);
                }
            }
        });

        Optional<Integer> v = this.isogram.values().stream().sorted((a, b) -> Integer.compare(b, a)).findFirst();
        return v.isPresent() && v.get() == 1;
    }

}
