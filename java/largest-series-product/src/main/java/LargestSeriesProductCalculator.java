import java.util.Arrays;
import java.util.stream.IntStream;

class LargestSeriesProductCalculator {
    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber = inputNumber;

        if (this.inputNumber.matches(".*[a-zA-Z].*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    private void validateNumberOfDigits(int numberOfDigits) {
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        if (numberOfDigits > this.inputNumber.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        this.validateNumberOfDigits(numberOfDigits);

        if (numberOfDigits == 0)
            return 1;

        return IntStream.iterate(0, i -> i <= inputNumber.length() - numberOfDigits, i -> i + 1)
                .mapToObj(i -> this.inputNumber.substring(i, i + numberOfDigits))
                .mapToLong(s -> Arrays.stream(s.split("")).mapToLong(Long::parseLong).reduce(1L, (a, b) -> a*b))
                .max()
                .orElse(1);
    }
}
