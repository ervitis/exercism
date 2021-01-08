class Proverb {
    private String[] words;
    private String template = "For want of a %s the %s was lost.";
    private String finalSentence = "And all for the want of a %s.";

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (this.words.length == 0) {
            return "";
        }

        String[] proverb = new String[this.words.length];

        for (int i = 0; i < this.words.length - 1; i++) {
            proverb[i] = String.format(this.template, this.words[i], this.words[i+1]);
        }
        proverb[this.words.length-1] = String.format(this.finalSentence, this.words[0]);

        return String.join("\n", proverb);
    }

}
