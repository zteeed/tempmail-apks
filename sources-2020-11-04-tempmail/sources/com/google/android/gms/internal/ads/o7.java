package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o7 implements Runnable {
    o7(p7 p7Var) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
