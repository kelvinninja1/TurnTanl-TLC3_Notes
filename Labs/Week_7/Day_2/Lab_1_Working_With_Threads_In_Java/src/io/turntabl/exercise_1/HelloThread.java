package io.turntabl.exercise_1;

public class HelloThread {
    public static void main(String[] args) {
        Thread hello = new Thread(() -> {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){}
            }
        });
        hello.start();
    }

    public static void TryHello(){
        //run
    }

}
