package taskLesson05;

import java.util.Arrays;

public class SampleThread extends Thread {

    final int SIZE = 10_000_000;

    SampleThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println(getName() + " started");
    }

    public void operationWithArrayInOneThread(){
        float[] array = new float[SIZE];
        for(int i = 0; i < array.length; i++){
            array[i] = 1F;
        }
        long initialTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2F + i / 5)
                    * Math.cos(0.2F + i / 5) * Math.cos(0.4F + i / 2));
        }

        System.currentTimeMillis();
        System.out.println("Task execution time in one thread: " + (System.currentTimeMillis() - initialTime));
    }
    
}
