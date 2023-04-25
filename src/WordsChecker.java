import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words) {
            set.add(word);
        }
    }

    public boolean hasWord(String fineWord) {

        return set.contains(fineWord);
    }
}
