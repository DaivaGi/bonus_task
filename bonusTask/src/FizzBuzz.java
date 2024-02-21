import java.util.ArrayList;
import java.util.List;

/**
 * @author Daiva Gikariene
 */
public class FizzBuzz {

    private final List<Condition> conditions;
    private final List<String> result;

    public FizzBuzz() {
        this.result = new ArrayList<>();
        this.conditions = new ArrayList<>();
    }

    public void addCondition(String word, List<Integer> numbers){
        Condition newCondition = new Condition(word, numbers);
        conditions.add(newCondition);
    }

    public void changeList(int from, int to) {
        conditions.sort((condition1 , condition2) -> condition2.getNumbers().size() - condition1.getNumbers().size());
        for (int i = from; i <= to; ++i) {
            int currentNumber = i;
            if (conditions.stream().noneMatch(condition -> conditionTrue(condition, currentNumber))) {
                result.add(Integer.toString(currentNumber));
            }
        }
    }

    private Boolean conditionTrue(Condition condition, int currentNumber) {
        if (currentNumber == 0){
            result.add(Integer.toString(currentNumber));
            return true;
        }
        if (condition.getNumbers().size() == 3) {
            if (currentNumber % condition.getNumbers().get(0) == 0
                    && currentNumber % condition.getNumbers().get(1) == 0
                    && currentNumber % condition.getNumbers().get(2) == 0) {
                result.add(condition.getWord());
                return true;
            }
        } else if (condition.getNumbers().size() == 2) {
            if (currentNumber % condition.getNumbers().get(0) == 0
                    && currentNumber % condition.getNumbers().get(1) == 0) {
                result.add(condition.getWord());
                return true;
            }
        } else if (condition.getNumbers().size() == 1) {
            if (currentNumber % condition.getNumbers().get(0) == 0) {
                result.add(condition.getWord());
                return true;
            }
        }
            return false;
    }

    public void printChangedList(){
        for (String res : result) {
            System.out.println(res + " ");
        }
    }
}

