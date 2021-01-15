import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class RnaTranscription {

    static Map<String, String> transitions = new HashMap<>(Map.ofEntries(
            Map.entry("G", "C"),
            Map.entry("C", "G"),
            Map.entry("T", "A"),
            Map.entry("A", "U")
    ));

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        char[] d = dnaStrand.toUpperCase(Locale.ROOT).toCharArray();

        for (char c : d) {
            sb.append(transitions.get(Character.toString(c)));
        }

        return sb.toString();
    }

}
