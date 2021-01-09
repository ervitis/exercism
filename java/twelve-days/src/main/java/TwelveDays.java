/*
On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.
On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwelveDays {

    private String onthDay(int verseNumber) {
        String[] numbers = new String[]{
                "zero", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };

        return String.format("On the %s day of Christmas my true love gave to me: ", numbers[verseNumber]);
    }

    private String presents(int verseNumber) {
        String[] pr = new String[]{
                "two Turtle Doves",
                "three French Hens",
                "four Calling Birds",
                "five Gold Rings",
                "six Geese-a-Laying",
                "seven Swans-a-Swimming",
                "eight Maids-a-Milking",
                "nine Ladies Dancing",
                "ten Lords-a-Leaping",
                "eleven Pipers Piping",
                "twelve Drummers Drumming"
        };

        return IntStream.range(1, verseNumber).map(i -> -i).sorted().map(i -> -i).mapToObj(i -> pr[i-1] + ", ").collect(Collectors.joining());
    }

    private String partridge(int verseNumber) {
        return (verseNumber > 1 ? "and " : "") + "a Partridge in a Pear Tree.\n";
    }

    String verse(int verseNumber) {
        return onthDay(verseNumber) + presents(verseNumber) + partridge(verseNumber);
    }

    String verses(int startVerse, int endVerse) {
        return IntStream.range(startVerse, endVerse+1).mapToObj(this::verse).collect(Collectors.joining("\n"));
    }

    String sing() {
        return verses(1, 12);
    }
}
