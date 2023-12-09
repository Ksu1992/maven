package org.alevel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvBuilder {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.csv")) {
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.println("Введите текст (введите 'next' для перехода на новую строку, 'end' для завершения): ");
                input = scanner.nextLine();

                if (input.equals("end")) {
                    break;
                } else if (input.equals("next")) {
                    writer.write("\n");
                } else {
                    writer.write(input);
                    writer.write(",");
                }
            }

            System.out.println("CSV файл успешно создан (output.csv).");
        } catch (IOException e) {
            System.err.println("Ошибка при создании CSV файла: " + e.getMessage());
        }
    }
}

