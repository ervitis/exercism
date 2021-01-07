import java.util.Random;

class DnDCharacter {

    private int strength, dexterity, constitution, intelligence, wisdom, charisma;

    public DnDCharacter() {
        this.strength = this.ability();
        this.dexterity = this.ability();
        this.constitution = this.ability();
        this.intelligence = this.ability();
        this.wisdom = this.ability();
        this.charisma = this.ability();
    }

    int ability() {
        Random random = new Random();
        int[] rolls = new int[4];

        int lowest = 6;
        int lowestIndex = 0;
        for (int i = 0; i < 4; i++) {
            int rolled = random.nextInt(6) + 1;
            rolls[i] = rolled;

            if (lowest > rolled) {
                lowest = rolled;
                lowestIndex = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            if (lowestIndex != i) {
                sum += rolls[i];
            }
        }
        return sum;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(this.constitution);
    }

}
