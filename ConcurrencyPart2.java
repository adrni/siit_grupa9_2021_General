package siit.Homework.Concurrency;
import java.util.LinkedList;
import java.util.List;

public class ConcurrencyPart2 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> randomNumbers = new LinkedList<Integer>();

        Thread1RunnablePart2 thread1Runnable = new Thread1RunnablePart2(randomNumbers);
        Thread thread1=new Thread(thread1Runnable);
        thread1.start();
        thread1.join();
        randomNumbers=thread1Runnable.getRandomNumbers();

        Thread1RunnablePart2 thread2Runnable = new Thread1RunnablePart2(randomNumbers);
        Thread thread2=new Thread(thread2Runnable);
        thread2.start();
        thread2.join();
        randomNumbers=thread2Runnable.getRandomNumbers();

        Thread1RunnablePart2 thread3Runnable = new Thread1RunnablePart2(randomNumbers);
        Thread thread3=new Thread(thread3Runnable);
        thread3.start();
        thread3.join();
        randomNumbers=thread3Runnable.getRandomNumbers();

        Thread1RunnablePart2 thread4Runnable = new Thread1RunnablePart2(randomNumbers);
        Thread thread4=new Thread(thread4Runnable);
        thread4.start();
        thread4.join();
        randomNumbers=thread4Runnable.getRandomNumbers();

        Thread1RunnablePart2 thread5Runnable = new Thread1RunnablePart2(randomNumbers);
        Thread thread5=new Thread(thread5Runnable);
        thread5.start();
        thread5.join();
        randomNumbers=thread5Runnable.getRandomNumbers();

        int sum=0;
        System.out.print("Random numbers: ");
        for (int number:randomNumbers){
            System.out.print(number+ " ");
            sum+=number;
        }
        System.out.println("\nSum of all random numbers: "+sum);
    }
}
