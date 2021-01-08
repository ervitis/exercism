class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        char[] isbnChars = stringToVerify.replaceAll("[^0-9X]", "").toCharArray();
        if (isbnChars.length != 10) {
            return false;
        }

        int sum = 0;
        int multiplier = 10;
        for (int i = 0; i < isbnChars.length; i++) {
            int total = multiplier * ((isbnChars[i] == 'X' && i == 9) ? 10 : Character.getNumericValue(isbnChars[i]));
            sum += total;
            multiplier--;
        }

        return sum % 11 == 0;
    }

}
