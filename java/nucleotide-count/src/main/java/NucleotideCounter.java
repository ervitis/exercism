/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {
    private String dna;
    private Map<Character, Integer> count;

    public NucleotideCounter(String dna) {
        this.count = new HashMap<>( Map.of(
                'A', 0,
                'C', 0,
                'G', 0,
                'T', 0
        ));

        for (char c : dna.toCharArray()) {
            if (!"ACGT".contains(Character.toString(c))) {
                throw new IllegalArgumentException();
            }
        }
        this.dna = dna;
    }

    public Map<Character, Integer> nucleotideCounts() {
        for (char c : this.dna.toCharArray()) {
            this.count.put(c, this.count.get(c) + 1);
        }

        return this.count;
    }
}