class ReverseString {

    String reverse(String inputString) {
        char[] reverse = new char[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            reverse[inputString.length() - i - 1] = inputString.charAt(i);
        }
        return new String(reverse);
    }

}
