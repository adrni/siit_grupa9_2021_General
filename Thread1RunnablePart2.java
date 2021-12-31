package siit.Homework.Concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Thread1RunnablePart2 implements Runnable{
    List<Integer> randomNumbers;

    public Thread1RunnablePart2 (List<Integer> randomNumbers){
        this.randomNumbers=randomNumbers;
    }

    @Override
    public synchronized void run() {
        Random rand = new Random();
        synchronized (this) {
             int randomNumber = rand.nextInt(10) + 1;
            randomNumbers.add(randomNumber);
        }
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
