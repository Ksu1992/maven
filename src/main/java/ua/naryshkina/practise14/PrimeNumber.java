package ua.naryshkina.practise14;

import java.util.concurrent.*;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 10, 13, 17, 20, 23, 29, 31};

        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Создаем задачи для подсчета простых чисел в каждом потоке
        Future<Integer> future1 = executorService.submit(() -> countPrimeNumbers(numbers, 0, numbers.length / 2));
        Future<Integer> future2 = executorService.submit(() -> countPrimeNumbers(numbers, numbers.length / 2, numbers.length));

        try {
            // Получаем результаты выполнения задач
            int count1 = future1.get();
            int count2 = future2.get();

            // Суммируем результаты
            int totalCount = count1 + count2;

            // Выводим результат
            System.out.println("Общее количество простых чисел: " + totalCount);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Завершаем работу пула потоков
            executorService.shutdown();
        }
    }

    private static int countPrimeNumbers(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        System.out.println("Поток " + Thread.currentThread().getId() + ": " + count + " простых чисел.");
        return count;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
