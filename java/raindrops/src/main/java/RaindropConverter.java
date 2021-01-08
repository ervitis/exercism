import java.util.*;

class RaindropConverter {

    private Map<Integer, String> raindrops = new HashMap<>(Map.ofEntries(
            Map.entry(3, "Pling"),
            Map.entry(5, "Plang"),
            Map.entry(7, "Plong")
    ));

    String convert(int number) {
        List<String> e = new ArrayList<>();
        StringBuffer conversion = new StringBuffer();

        int r;
        boolean found = false;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                r = number / i;
                if (this.raindrops.containsKey(r)) {
                    found = true;
                    e.add(this.raindrops.get(r));
                }
            }
        }
        Collections.reverse(e);
        e.forEach(conversion::append);
        return found ? conversion.toString() : number + "";
    }

}
