package ua.naryshkina.practise15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) {
        try {
            // Получаем класс
            Class<?> clazz = Class.forName("ua.naryshkina.practise15.A");

            //  Приватный конструктор
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            //  Доступ к приватному конструктору
            constructor.setAccessible(true);

            //  Экземпляр класса
            A instance = (A) constructor.newInstance();

            // Изменяем значения переменных через рефлексию
            Field idField = clazz.getDeclaredField("id");
            Field nameField = clazz.getDeclaredField("name");

            //  Доступ к приватным полям
            idField.setAccessible(true);
            nameField.setAccessible(true);

            // Изменяем значения переменных
            idField.set(instance, "456");
            nameField.set(instance, "B");

            //  Результат
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
