package com.google.android.gms.internal.firebase_messaging;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
public final class zzn {
    public static int a(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
