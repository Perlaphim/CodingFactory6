package gr.aueb.cf.ch8.prct;

import java.util.Optional;

public class NullOptional {

    public static void main(String[] args) {

    }

    public static Optional<String> getStringStartWith(String[] arr, String str) {
        if (arr == null || str == null) return Optional.empty();

        Optional<String> token = Optional.empty();

        for (String s : arr) {
            if (s.startsWith(str)) {
                token = Optional.of(str);
                break;
            }
        }
        return token;
    }
}
