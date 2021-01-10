/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class PigLatinTranslator {
    public String translate(String sentence) {
        return Arrays.stream(sentence.split("\\s+")).map(this::translateWord).collect(Collectors.joining(" "));
    }

    String translateWord(String word){
        return mutateWord(word).concat("ay");
    }

    String mutateWord(String word){
        if(word.matches("^([aeiou]|xr|yt).*"))
            return word;

        Matcher m  = Pattern.compile("^([^aeiou]+qu).*").matcher(word);
        if (m.matches())
            return word.replaceFirst("[^aeiou]+qu", "").concat(m.group(1));

        m.usePattern(Pattern.compile("^([^aeiou]+)y+.*"));
        if (m.matches())
            return word.replaceFirst("[^aeiouy]+", "").concat(m.group(1));

        m.usePattern(Pattern.compile("^(qu|[^aeiou]+).*"));
        if (m.matches())
            return word.replaceFirst("(qu|[^aeiou]+)", "").concat(m.group(1));

        return word;
    }
}