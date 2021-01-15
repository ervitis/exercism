class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] s = Integer.toString(numberToCheck).toCharArray();
        int exp = s.length;

        int t = 0;

        for (char c : s) {
            t += Math.pow(Character.getNumericValue(c), exp);
        }

        return t == numberToCheck;
    }

}
