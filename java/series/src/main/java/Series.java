import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Series {
    private String numbers;

    public Series(String numbers) {
        this.numbers = numbers;
    }

    public List<String> slices(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }

        if (limit > this.numbers.length()) {
            throw new IllegalArgumentException("Slice size is too big.");
        }

        return IntStream.rangeClosed(0, this.numbers.length() - limit).mapToObj(i -> this.numbers.substring(i, i + limit)).collect(Collectors.toList());
    }
}