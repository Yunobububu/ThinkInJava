package com.lvjinke.bit.Concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CloseResource {
    public static void execute() throws IOException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        ServerSocket server = new ServerSocket(8081);
        InputStream socketin = new Socket("localhost",8081).getInputStream();
        exec.execute(new IOBlocked(socketin));
        exec.execute(new IOBlocked(System.in));
        exec.shutdownNow();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Closing "+ socketin.getClass().getName());
        socketin.close();
        TimeUnit.SECONDS.sleep(1);
        System.in.close();

    }
}
