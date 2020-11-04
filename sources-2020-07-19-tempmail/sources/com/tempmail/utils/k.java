package com.tempmail.utils;

import java.net.HttpURLConnection;
import java.net.URLConnection;

/* compiled from: InterruptThread */
public class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    URLConnection f12575b;

    public k(Thread thread, URLConnection uRLConnection) {
        this.f12575b = uRLConnection;
    }

    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        System.out.println("Timer thread forcing parent to quit connection");
        ((HttpURLConnection) this.f12575b).disconnect();
        System.out.println("Timer thread closed connection held by parent, exiting");
    }
}
