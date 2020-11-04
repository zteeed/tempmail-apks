package com.google.firebase.g;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f11685b;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11686a;

    private d(Context context) {
        this.f11686a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f11685b == null) {
                f11685b = new d(context);
            }
            dVar = f11685b;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean c(String str, long j) {
        if (!this.f11686a.contains(str)) {
            this.f11686a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f11686a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f11686a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
