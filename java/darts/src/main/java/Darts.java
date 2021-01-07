class Darts {
    private double result;

    Darts(double x, double y) {
        this.result = x*x + y*y;
    }

    int score() {
        if (this.result <= 1) {
            return 10;
        }
        if (this.result <= 25) {
            return 5;
        }
        if (this.result <= 100) {
            return 1;
        }
        return 0;
    }

}
