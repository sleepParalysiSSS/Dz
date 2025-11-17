import java.util.*;

public class Dz1610 {
    public static void main(String[] args) {

        // 1.
        String[] words = {
                "карась", "пельмени", "карась", "дом", "кошка",
                "дом", "холодильник", "карась", "кошка", "мир",
                "мир", "пельмени", "котик", "холодильник", "дом"
        };

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String w : words) {
            if (wordsCount.containsKey(w)) {
                int oldValue = wordsCount.get(w);
                wordsCount.put(w, oldValue + 1);
            } else {
                wordsCount.put(w, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String key : wordsCount.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nСколько раз встречается каждое слово:");
        for (String key : wordsCount.keySet()) {
            System.out.println(key + " = " + wordsCount.get(key));
        }


        // 2.
        PhoneBook book = new PhoneBook();

        book.add("Иванов", "8800553535");
        book.add("Петров", "8800553569");
        book.add("Кузнецов", "8800554535"); 
        book.add("Яценко", "8800733535");
        book.add("Федоров", "8800693535");
        book.add("Иванов", "8800787235");

        System.out.println("\nНомер/a Иванова:");
        book.get("Иванов");

        System.out.println("\nНомер/a Федорова:");
        book.get("Федоров");

        System.out.println("\nНомер/a Бурачука:");
        book.get("Бурачук");
    }
}


interface PhoneBookInterface {
    void add(String surname, String phone);
    void get(String surname);
}


class PhoneBook implements PhoneBookInterface {

    HashMap<String, ArrayList<String>> catalog = new HashMap<>();

    public void add(String surname, String phone) {
        if (!catalog.containsKey(surname)) {
            catalog.put(surname, new ArrayList<String>());
        }
        catalog.get(surname).add(phone);
    }

    public void get(String surname) {
        if (catalog.containsKey(surname)) {
            ArrayList<String> phones = catalog.get(surname);
            for (String p : phones) {
                System.out.println(p);
            }
        } else {
            System.out.println("Такой фамилии нет.");
        }
    }
}