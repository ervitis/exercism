public class Twofer {
    public String twofer(String name) {
        if (name == null || name.trim().isBlank()) {
            name = "you";
        }
        return "One for {}, one for me.".replaceAll("\\{}", name);
    }
}
