import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    private List<String> diamond;

    public DiamondPrinter() {
        this.diamond = new ArrayList<>();
    }

    List<String> printToList(char a) {
        int diff = a - 'A';
        int l = 2 * diff + 1;
        int half = l / 2;

        for (int i = 0; i < l; i++) {
            this.diamond.add(" ".repeat(l));
        }

        char c = 'A';
        for (int i = 0; i <= half; i++, c++) {
            int left = half - i;
            int right = half + i;
            char[] upperDiamond = this.diamond.get(i).toCharArray();
            char[] lowerDiamond = this.diamond.get(this.diamond.size() - 1 - i).toCharArray();

            upperDiamond[left] = c;
            upperDiamond[right] = c;
            lowerDiamond[left] = c;
            lowerDiamond[right] = c;
            this.diamond.set(i, new String(upperDiamond));
            this.diamond.set(this.diamond.size() - 1 -i, new String(lowerDiamond));
        }

        return this.diamond;
    }

}
