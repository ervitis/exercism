class LuhnValidator {

    /*
    4539 1488 0343 6467

    4_3_ 1_8_ 0_4_ 6_6_   -> 1488 -> 8x2=16 -> 16 - 9 = 7 -> 2478

    8569 2478 0383 3437

    8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 % 10 == 0
     */
    boolean isValid(String candidate) {
        if (candidate.trim().length() < 2) {
            return false;
        }

        char[] v = candidate.toCharArray();
        int total = 0;
        boolean doubleIt = false;
        int t;
        for (int i = candidate.length() - 1; i >= 0; i--) {
            if (Character.isSpaceChar(v[i])) {
                continue;
            }

            if (!Character.isDigit(v[i])) {
                return false;
            }

            int d = Character.getNumericValue(v[i]);
            if (doubleIt) {
                d = d * 2;
            }
            t = d >= 10 ? d - 9 : d;
            doubleIt = !doubleIt;
            total += t;
        }
        return total % 10 == 0;
    }

}
