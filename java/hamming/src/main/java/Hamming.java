public class Hamming {
    private String leftStrand, rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand.trim();
        this.rightStrand = rightStrand.trim();

        this.validateStrand();
    }

    private void validateStrand() {
        if (this.leftStrand == null) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (this.rightStrand == null) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (this.leftStrand.isBlank() && !this.rightStrand.isBlank()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (this.rightStrand.isBlank() && !this.leftStrand.isBlank()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (this.leftStrand.length() != this.rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < this.leftStrand.length(); i++) {
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
