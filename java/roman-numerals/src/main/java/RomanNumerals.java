import java.util.Map;
import java.util.TreeMap;

class RomanNumeral {

    private final int number;

    private static final TreeMap<Integer, String> romanConversion = new TreeMap<>(Map.ofEntries(
            Map.entry(1000, "M"),
            Map.entry(900, "CM"),
            Map.entry(500, "D"),
            Map.entry(400, "CD"),
            Map.entry(100, "C"),
            Map.entry(90, "XC"),
            Map.entry(50, "L"),
            Map.entry(40, "XL"),
            Map.entry(10, "X"),
            Map.entry(9, "IX"),
            Map.entry(5, "V"),
            Map.entry(4, "IV"),
            Map.entry(1, "I")
    ));

    public RomanNumeral(int number) {
        this.number = number;
    }

    public String getRomanNumeral() {
        return this.transform(this.number);
    }

    private String transform(int number) {
        int k = romanConversion.floorKey(number);

        if (k == number) {
            return romanConversion.get(number);
        }

        return romanConversion.get(k).concat(this.transform(number - k));
    }
}