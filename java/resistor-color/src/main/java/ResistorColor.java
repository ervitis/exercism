import java.util.*;

class ResistorColor {
    private Map<String, Integer> colorValues;

    public ResistorColor() {
        this.colorValues = new LinkedHashMap<>();
        this.colorValues.put("black", 0);
        this.colorValues.put("brown", 1);
        this.colorValues.put("red", 2);
        this.colorValues.put("orange", 3);
        this.colorValues.put("yellow", 4);
        this.colorValues.put("green", 5);
        this.colorValues.put("blue", 6);
        this.colorValues.put("violet", 7);
        this.colorValues.put("grey", 8);
        this.colorValues.put("white", 9);
    }

    Object colorCode(String color) {
        return this.colorValues.get(color);
    }

    String[] colors() {
        return this.colorValues.keySet().toArray(new String[0]);
    }
}
