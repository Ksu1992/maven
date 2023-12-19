package org.alevel.Practise11;
//Реализовать метод, принимающий список строк и возвращающий Map, где
//ключ - строка, значение - количество букв в строке.
//Пример:
//[“тут”, “там”, “стол”] -> [ {“тут”, 3}, {“там”, 3}, {“стол”, 4}]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLengthCounter {

    public static Map<String, Integer> countStringLength(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String str : strings) {
            resultMap.put(str, str.length());
        }

        return resultMap;
    }

    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();
        inputStrings.add("тут");
        inputStrings.add("там");
        inputStrings.add("стол");

        Map<String, Integer> result = countStringLength(inputStrings);

        // Результат
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}

