import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        list.add("Завтрак");
        list.add("Работа");
        list.add("Отдых-Обед");
        list.add("Поход за продуктами");
        list.add("Встреча с друзьями(Шашлыки)");
        list.add("Сон");

        System.out.println("Выберите действие:\n" +
                "1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход");

        if (scanner.nextInt() == 1) {
            System.out.println("Название: ");
            scanner.next();
            System.out.println("Текст: ");
            list.add(scanner.next());
            System.out.println("Задача добавлена!!");
        } else {
            System.out.println("Error 303 ");
        }
        if (scanner.nextInt() == 2) {
            System.out.println(list);
        } else {
            System.out.println("Error 404 ");
        }
        if (scanner.nextInt() == 3) {
            list.remove(scanner.nextInt());
            System.out.println("Задача удалена");
            System.out.println(list);
        } else {
            System.out.println("Error 505 ");
        }
        if (scanner.nextInt() == 0) {
            System.out.println("Exit");
        }

    }
}
