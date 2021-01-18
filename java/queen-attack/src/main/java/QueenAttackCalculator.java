class QueenAttackCalculator {

    Queen white, black;

    public QueenAttackCalculator(Queen white, Queen black) {
        this.white = white;
        this.black = black;

        if (this.white == null || this.black == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }

        if (this.white.equals(this.black)) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
    }

    public boolean canQueensAttackOneAnother() {
        return this.white.x == this.black.x ||
                this.white.y == this.black.y ||
                Math.abs(this.white.x - this.black.x) == Math.abs(this.white.y - this.black.y);
    }
}