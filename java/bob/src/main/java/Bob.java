import java.util.Locale;

class Bob {

    private final static String DEFAULT = "Whatever.";
    private final static String WHOA = "Whoa, chill out!";
    private final static String SURE = "Sure.";
    private final static String INDIGN = "Fine. Be that way!";
    private final static String CALM = "Calm down, I know what I'm doing!";

    public String hey(String sentence) {
        boolean isYelling = this.isYelling(sentence) && sentence.equals(sentence.toUpperCase(Locale.ROOT));
        boolean isQuestion = sentence.trim().endsWith("?");

        if (isQuestion && isYelling) {
            return CALM;
        }

        if (isQuestion) {
            return SURE;
        }

        if (sentence.trim().length() == 0) {
            return INDIGN;
        }

        if (isYelling) {
            return WHOA;
        }

        return DEFAULT;
    }

    private boolean isYelling(String sentence) {
        char[] t = sentence.toCharArray();
        boolean isYelling = false;

        for (char c : t) {
            if (Character.isAlphabetic(c)) {
                isYelling = Character.isUpperCase(c);
            }
        }
        return isYelling;
    }
}