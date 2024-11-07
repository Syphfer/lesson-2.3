//System.arraycopy(); - копировать массив
//ArrayList<String> list = new ArrayList<>(); - пример динамического списка для букв
//ArrayList<Integer> list = new ArrayList<>(); -  динамический список для чисел
//list.add(" ... "); - добавить элемент в список
//list.contains("..."); - найти элемент в списке
//list.remove("...") - удалить элемент из списка (первый попавшийся)
//for (int i = 0; i < 10; i++) {
//     list.add("...");
//    }   - пример добавления элементов в список с помощью цикла fori
//
// while (list.remove("...")) - удалить все указанные элементы
//
//HashSet<String> set = new HashSet<>(); - для хранения уникальных элементов, откидывает дубликаты
//HashMap<String, String> map = new HashMap<>(); -
//map.put("...","..."); - положить элементы в стринговую хэшмапу
//LinkedList
//
//1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.
//2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
//лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
//справочника.


package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Java", "Java", "Cat", "Dog", "Burger", "Car", "List", "Main", "Pen"
        );

Set<String> book = new HashSet<>(words);

for (String uniqueWords : book) {
    System.out.println(uniqueWords + " встречается " + Collections.frequency(words, uniqueWords) + " раз(а) ");
}


PhoneBook phoneBook = new PhoneBook();
phoneBook.add("Petrov", "22222");
phoneBook.add("Petrov", "22225");
phoneBook.add("Ivanov", "33333");
phoneBook.get("Petrov");
phoneBook.get("Vasyan");

    }
}