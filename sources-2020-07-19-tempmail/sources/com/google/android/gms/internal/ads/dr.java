package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class dr implements Runnable {
    private dr() {
    }

    public final void run() {
        try {
            MessageDigest unused = bq.f3493b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            bq.f3496e.countDown();
        }
    }
}
