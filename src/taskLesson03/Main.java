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
            "There", "is", "no", "escape", "It", "all", "persists"};

// первый способ выполнения
    private static void wordCount(String[] array) {
        Set<String> text = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            text.add(array[i]);
        }
        System.out.println(text);
    }

// второй способ выполнения
    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

// первый способ выполнения
    private static void counterWords(String[] array) {
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            counter.put(array[i], counter.getOrDefault(array[i], 0) + 1);
        }
        System.out.println(counter);
    }

// второй способ выполнения
    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        wordCount(alexanderBlok);
        System.out.println(getWords(alexanderBlok));

        counterWords(alexanderBlok);
        System.out.println(getWordsCount(alexanderBlok));

        Phonebook phonebook = new Phonebook();

        phonebook.add("Liberman", "89033794581", "luk53@gmail.com");
        phonebook.add("Shchelokov", "89178595043", "shcel@mail.ru");
        phonebook.add("Liberman", "89277462431", "surikov42@gmail.com");
        phonebook.add("Shchelokov", "89324672856", "sormik@yandex.ru");
        phonebook.add("Dolotov", "89178000000", "darivik@mail.ru");


        System.out.println("e-mail Liberman: " + phonebook.getMails("Liberman"));
        System.out.println("e-mail Shchelokov: " + phonebook.getMails("Shchelokov"));
        System.out.println("phone Liberman: " + phonebook.getPhones("Liberman"));
        System.out.println("phone Shchelokov: " + phonebook.getPhones("Shchelokov"));
        System.out.println("phone Dolotov: " + phonebook.getPhones("Dolotov"));
        System.out.println("e-mail Dolotov: " + phonebook.getMails("Dolotov"));
    }
}
