import java.util.Arrays;
import java.util.List;


class Knapsack {
    public int maximumValue(int limit, List<Item> items) {
        Item[] arrItems = new Item[items.size()];
        items.toArray(arrItems);

        int n = items.size();
        int[][] m = new int[n + 1][limit + 1];
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];

        int i = 0;
        for (Item item : items) {
            i++;
            w[i] = item.getWeight();
            v[i] = item.getValue();
        }

        Arrays.fill(m[0], 0);

        for (i = 1; i <= n; i++)
            for (int j = 1; j <= limit; j++)
                if (w[i] > j)
                    m[i][j] = m[i - 1][j];
                else
                    m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - w[i]] + v[i]);

        return m[n][limit];
    }
}