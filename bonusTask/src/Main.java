import java.util.List;

/**
 * @author Daiva Gikariene
 */
public class Main {
    public static void main(String[] args) {

        //Create FizzBuzz object
        FizzBuzz fizzBuzz = new FizzBuzz();

        //Add conditions
        fizzBuzz.addCondition("Fizz", List.of(3));
        fizzBuzz.addCondition("BuzzJazz", List.of(5, 7));
        fizzBuzz.addCondition("FizzBuzz", List.of(5, 3));
        fizzBuzz.addCondition("Jazz", List.of(7));
        fizzBuzz.addCondition("Buzz", List.of(5));
        fizzBuzz.addCondition("FizzBuzzJazz", List.of(3, 5, 7));
        fizzBuzz.addCondition("FizzJazz", List.of(3, 7));

        int from = 1;
        int to = 105;
        fizzBuzz.changeList(from, to);
        fizzBuzz.printChangedList();

    }
}