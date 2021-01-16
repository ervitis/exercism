import java.util.Map;
import java.util.stream.Collectors;

public class PangramChecker {

    Map<Character, Integer> alphabet;

    public PangramChecker() {
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".codePoints().mapToObj(c -> (char)c).collect(Collectors.toMap(character -> character, character -> 0));
    }

    public boolean isPangram(String input) {
        input = input.trim();
        if (input.isEmpty()) {
            return false;
        }

        input.codePoints().mapToObj(c -> (char)c).map(Character::toUpperCase).filter(e -> this.alphabet.containsKey(e)).forEach(c -> {
            this.alphabet.put(c, this.alphabet.get(c)+1);
        });
        return this.alphabet.values().stream().allMatch(e -> e != 0);
    }

}
