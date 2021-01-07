import java.math.BigInteger;

class Grains {

    private static final BigInteger power = BigInteger.TWO;

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return power.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return power.pow(64).subtract(BigInteger.ONE);
    }

}
