import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
class Allergies {
    private int allergyScore;

    public Allergies(int allergyScore) {
        this.allergyScore = allergyScore;
    }

    public boolean isAllergicTo(Allergen allergen) {
        return (this.allergyScore & allergen.getScore()) > 0;
    }

    public List<Allergen> getList() {
        return Arrays.stream(Allergen.values()).filter(this::isAllergicTo).collect(Collectors.toList());
    }
}