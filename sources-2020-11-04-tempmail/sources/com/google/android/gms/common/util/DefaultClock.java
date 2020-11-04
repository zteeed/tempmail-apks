package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class DefaultClock implements Clock {

    /* renamed from: a  reason: collision with root package name */
    private static final DefaultClock f3299a = new DefaultClock();

    private DefaultClock() {
    }

    @KeepForSdk
    public static Clock d() {
        return f3299a;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return System.nanoTime();
    }
}
