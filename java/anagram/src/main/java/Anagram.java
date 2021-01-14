import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class Anagram {
    final String word;
    char []words;

    Anagram(String word) {
        this.word = word.toUpperCase(Locale.ROOT);
        this.words = word.toUpperCase(Locale.ROOT).toCharArray();
    }

    List<String> match(List<String> words) {
        List<String> anagrams = new ArrayList<>();

        words.forEach(w -> {
            char []p = w.toUpperCase(Locale.ROOT).toCharArray();
            String wl = w.toUpperCase(Locale.ROOT);

            Arrays.sort(p);
            Arrays.sort(this.words);

            if (Arrays.equals(this.words, p) && !this.word.equals(wl)) {
                anagrams.add(w);
            }
        });
        return anagrams;
    }
}