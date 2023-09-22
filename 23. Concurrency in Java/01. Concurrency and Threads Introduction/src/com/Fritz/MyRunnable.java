package com.Fritz;

import static com.Fritz.ThreadColor.*;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run().");
    }
}
