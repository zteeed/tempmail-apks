package com.google.firebase.g;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f11135b;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11136a;

    private d(Context context) {
        this.f11136a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f11135b == null) {
                f11135b = new d(context);
            }
            dVar = f11135b;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean c(String str, long j) {
        if (!this.f11136a.contains(str)) {
            this.f11136a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f11136a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f11136a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
