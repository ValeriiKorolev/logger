import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу.");
        logger.log("Просим пользователя ввести входные данные для списка");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        System.out.print("Введите размер списка: ");
        int sizeOfList = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");

        int currentValue;
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < sizeOfList; i++) {
            currentValue = random.nextInt(maxValue);
            input.add(currentValue);
            System.out.print(currentValue + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(filterValue);
        List<Integer> result = filter.filterOut(input);
        int sizeAfterFilter = result.size();
        logger.log("Прошли фильтрацию " + sizeAfterFilter + " из " + sizeOfList);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (Integer currentResult : result) {
            System.out.print(currentResult + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}
