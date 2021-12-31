package siit.Homework.Concurrency;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        Thread1Runnable thread1Runnable = new Thread1Runnable();
        Thread thread1=new Thread(thread1Runnable);

        Thread1Runnable thread2Runnable = new Thread1Runnable();
        Thread thread2=new Thread(thread2Runnable);

        Thread1Runnable thread3Runnable = new Thread1Runnable();
        Thread thread3=new Thread(thread3Runnable);

        Thread1Runnable thread4Runnable = new Thread1Runnable();
        Thread thread4=new Thread(thread4Runnable);

        Thread1Runnable thread5Runnable = new Thread1Runnable();
        Thread thread5=new Thread(thread5Runnable);

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();

        thread5.start();
        thread5.join();

        int sum=thread1Runnable.getRandomNumber()+thread2Runnable.getRandomNumber()
                +thread3Runnable.getRandomNumber()+thread4Runnable.getRandomNumber()
                +thread5Runnable.getRandomNumber();

        System.out.println("Thread1 random:  " +thread1Runnable.getRandomNumber()
                +" + Thread2 random: " +thread2Runnable.getRandomNumber()
                +" + Thread3 random: " +thread3Runnable.getRandomNumber()
                +" + Thread4 random: " +thread4Runnable.getRandomNumber()
                +" + Thread5 random: " +thread5Runnable.getRandomNumber()+ " = "
                +sum+" (Sum of all random numbers)");
    }

}
