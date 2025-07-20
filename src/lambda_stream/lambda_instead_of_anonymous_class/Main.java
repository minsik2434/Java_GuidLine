package lambda_stream.lambda_instead_of_anonymous_class;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("1234","12345");
        Collections.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Collections.sort(words, Comparator.comparingInt(String::length));

        words.sort(Comparator.comparingInt(String::length));
    }
}
