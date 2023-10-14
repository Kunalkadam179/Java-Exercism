import java.util.Arrays;
import java.util.List;

class ResistorColor {
    private static final String[] COLORS = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };
    int colorCode(String color) {
        return List.of(COLORS).indexOf(color);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String[] colors() {
        return COLORS;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
