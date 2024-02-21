import java.util.List;
import java.util.Objects;

/**
 * @author Daiva Gikariene
 */
public class Condition {

    private String word;
    private List<Integer> numbers;

    public Condition(String print, List<Integer> numbers) {
        this.word = print;
        this.numbers = numbers;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition that = (Condition) o;
        return Objects.equals(word, that.word) && Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, numbers);
    }
}
