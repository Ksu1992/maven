package ua.naryshkina.practise14;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        // Создание потоков
        Thread thread1 = new Thread(() -> {
            int count = countPrimes(numbers, 0, numbers.length / 2);
            System.out.println("Thread 1 counted: " + count);
        });

        Thread thread2 = new Thread(() -> {
            int count = countPrimes(numbers, numbers.length / 2, numbers.length);
            System.out.println("Thread 2 counted: " + count);
        });

        // Запуск потоков
        thread1.start();
        thread2.start();

        try {
            // Ожидаем завершения потоков
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод общего количества простых чисел
        int totalPrimes = countPrimes(numbers, 0, numbers.length);
        System.out.println("Total prime numbers: " + totalPrimes);
    }

    // Метод для подсчета простых чисел в заданном диапазоне массива
    private static int countPrimes(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        return count;
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) {
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
