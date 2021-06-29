package ua.lviv.lgs.lesson20.lecture;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {
    public static void main(String[] args) {
        ExecutorService executable = Executors.newFixedThreadPool(20);
        executable.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executor service task");
            }
        });
        executable.shutdown();
    }
}
