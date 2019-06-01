import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {
    private boolean isPositive(int value) {
        return value > 0;
    }

    public int calculateSumOfPositiveNumbers(List<Integer> collection) {
        return IntStream.range(0, collection.size()).reduce((sum,index)->sum += isPositive(collection.get(--index))?collection.get(index):0).getAsInt();
    }
}
