import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColorDuo {
    private Map<String, Integer> colorValues;

    public ResistorColorDuo() {
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

    int value(String[] colors) {
        int[] values = new int[colors.length];

        for (int i = 0; i < 2; i++) {
            values[i] = this.colorValues.get(colors[i]);
        }

        return Integer.parseInt(String.format("%d%d", values[0], values[1]));
    }
}
