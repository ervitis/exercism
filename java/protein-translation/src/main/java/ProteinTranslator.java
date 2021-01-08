import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private Map<String, String> aminoacids = new HashMap<>(Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", ""),
            Map.entry("UAG", ""),
            Map.entry("UGA", "")
    ));

    List<String> translate(String rnaSequence) {
        List<String> seq = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String subs = rnaSequence.substring(i, i + 3);
            if (!this.aminoacids.get(subs).isBlank())
                seq.add(this.aminoacids.get(subs));
            else
                break;
        }

        return seq;
    }
}
