import java.util.Objects;

class Queen {
    int x, y;

    public Queen(int x, int y) {
        this.x = x;
        this.y = y;

        this.validatePositions();
    }

    private void validatePositions() {
        if (this.x < 0) {
            throw new IllegalArgumentException("Queen position must have positive row.");
        } else if (this.y < 0) {
            throw new IllegalArgumentException("Queen position must have positive column.");
        } else if (this.x > 7) {
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        } else if (this.y > 7) {
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Queen))
            return false;
        Queen queen = (Queen) o;
        return x == queen.x && y == queen.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
