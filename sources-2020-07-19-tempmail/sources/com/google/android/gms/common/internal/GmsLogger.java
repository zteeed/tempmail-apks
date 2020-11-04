package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class GmsLogger {

    /* renamed from: a  reason: collision with root package name */
    private final String f3010a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3011b;

    public GmsLogger(String str, String str2) {
        Preconditions.l(str, "log tag cannot be null");
        Preconditions.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3010a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3011b = null;
        } else {
            this.f3011b = str2;
        }
    }

    private final String f(String str) {
        String str2 = this.f3011b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    @KeepForSdk
    public final boolean a(int i) {
        return Log.isLoggable(this.f3010a, i);
    }

    @KeepForSdk
    public final void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    @KeepForSdk
    public final void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, f(str2));
        }
    }

    @KeepForSdk
    public final void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    @KeepForSdk
    public final void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }
}
