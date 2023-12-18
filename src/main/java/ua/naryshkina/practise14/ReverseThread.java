package ua.naryshkina.practise14;

public class ReverseThread {
    public static void main(String[] args) {
        for (int i = 49; i >=0 ; i--) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Hello from thread " + threadNumber);
            });
            thread.start();
            try {
                thread.join(); // Ожидание завершения потока перед созданием следующего
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
