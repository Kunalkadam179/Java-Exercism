import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        return String.format("One for %s, one for me.",
                Optional.ofNullable(name).orElse("you"));
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
