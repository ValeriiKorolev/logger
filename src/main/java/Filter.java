import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int filter;

    public Filter(int filterValue) {
        this.filter = filterValue;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int currentValue;
        for (int i = 0; i < source.size(); i++) {
            currentValue = source.get(i);
            if (currentValue > filter) {
                result.add(currentValue);
                logger.log("Элемент '" + currentValue + "' проходит.");
            } else {
                logger.log("Элемент '" + currentValue + "' не проходит.");
            }
        }
        return result;
    }
}