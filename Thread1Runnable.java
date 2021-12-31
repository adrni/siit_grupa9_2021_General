package siit.Homework.Concurrency;

import java.util.Random;

public class Thread1Runnable implements Runnable{
int randomNumber;
    @Override
    public void run() {
        Random rand = new Random();
        randomNumber = rand.nextInt(10)+1;
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }
}
