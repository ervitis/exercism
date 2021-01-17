import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = Arrays.stream(phrase.toUpperCase(Locale.ROOT).replaceAll("['_!?]", "").replaceAll("-", " ").split(" ")).filter(w -> !w.isBlank()).map(w -> w.substring(0, 1)).collect(Collectors.joining(""));
    }

    String get() {
        return this.phrase;
    }

}
