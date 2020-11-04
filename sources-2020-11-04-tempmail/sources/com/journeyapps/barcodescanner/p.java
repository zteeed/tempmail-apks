package com.journeyapps.barcodescanner;

import android.os.Looper;

/* compiled from: Util */
public class p {
    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
