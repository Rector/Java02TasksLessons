package taskLesson03;

import java.util.*;

public class Main {
//    1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
//       - Найти список слов, из которых состоит текст (дубликаты не считать);
//       - Посчитать сколько раз встречается каждое слово (использовать HashMap);
//    2. Написать простой класс PhoneBook(внутри использовать HashMap):
//       - В качестве ключа использовать фамилию
//       - В каждой записи всего два поля: phone, e-mail
//       - Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
//       и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть
//       несколько записей. Итого должно получиться 3 класса Main, PhoneBook, Person.

    private static final String[] alexanderBlok = {"the", "night", "the", "pharmacy", "the", "street", "the", "pointless", "lamppost",
            "in", "the", "mist", "A", "quarter", "century", "recedes",
            "There", "is", "no", "escape", "It", "all", "persists" };

    private static void wordCount(String[] array) {
        LinkedHashSet<String> text = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            text.add(array[i]);
        }
        System.out.println(text);
    }

    private static void counterWords(String[] array) {
        HashMap<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            counter.put(array[i], counter.getOrDefault(array[i], 0) + 1);
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {

        wordCount(alexanderBlok);

        counterWords(alexanderBlok);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addNewRecord("Liberman", "89033794581");
        phoneBook.addNewRecord("Shchelokov", "89178595043");
        phoneBook.addNewRecord("Liberman", "89277462431");
        phoneBook.addNewRecord("Shchelokov", "89324672856");
        phoneBook.addNewRecord("Dolotov","89178000000");

        phoneBook.findPhone("Liberman");
        phoneBook.findPhone("Shchelokov");
        phoneBook.findPhone("Dolotov");


//        "Liberman", "luk53@gmail.com", "89033794581"
//        "Shchelokov", "shcel@mail.ru", "89178595043"
//        "surikov42@gmail.com", "89277462431"
//        "sormik@yandex.ru", "89324672856"
//        "Dolotov", "darivik@mail.ru", "89178000000"


    }

}
