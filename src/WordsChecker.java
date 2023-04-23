import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String fineWord) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        return set.contains(fineWord);
    }
}
