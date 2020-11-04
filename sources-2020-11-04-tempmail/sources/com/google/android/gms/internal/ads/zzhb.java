package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzhb extends Exception {
    private zzhb(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    public static zzhb a(IOException iOException) {
        return new zzhb(0, (String) null, iOException, -1);
    }

    public static zzhb b(Exception exc, int i) {
        return new zzhb(1, (String) null, exc, i);
    }

    static zzhb c(RuntimeException runtimeException) {
        return new zzhb(2, (String) null, runtimeException, -1);
    }
}
