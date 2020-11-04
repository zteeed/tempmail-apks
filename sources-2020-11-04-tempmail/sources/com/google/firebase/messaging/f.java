package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.q;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class f implements Runnable {
    private static final Object g = new Object();
    private static Boolean h;
    private static Boolean i;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11957b;

    /* renamed from: c  reason: collision with root package name */
    private final q f11958c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager.WakeLock f11959d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final d f11960e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11961f;

    f(d dVar, Context context, q qVar, long j) {
        this.f11960e = dVar;
        this.f11957b = context;
        this.f11961f = j;
        this.f11958c = qVar;
        this.f11959d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (g) {
            if (h == null) {
                z = c(context, "android.permission.WAKE_LOCK", h);
            } else {
                z = h.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
            sb.append("Missing Permission: ");
            sb.append(str);
            sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            Log.d("FirebaseMessaging", sb.toString());
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final synchronized boolean f() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11957b.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static boolean g(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (g) {
            if (i == null) {
                z = c(context, "android.permission.ACCESS_NETWORK_STATE", i);
            } else {
                z = i.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public static boolean h() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (b(this.f11957b)) {
            this.f11959d.acquire(i.f11966a);
        }
        try {
            boolean z = true;
            this.f11960e.g(true);
            if (!this.f11958c.c()) {
                this.f11960e.g(false);
                if (b(this.f11957b)) {
                    try {
                        this.f11959d.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!g(this.f11957b) || f()) {
                if (this.f11960e.h()) {
                    this.f11960e.g(false);
                } else {
                    this.f11960e.e(this.f11961f);
                }
                if (b(this.f11957b)) {
                    try {
                        this.f11959d.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                e eVar = new e(this, this);
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                        z = false;
                    }
                }
                if (z) {
                    Log.d("FirebaseMessaging", "Connectivity change received registered");
                }
                eVar.f11956b.f11957b.registerReceiver(eVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (b(this.f11957b)) {
                    try {
                        this.f11959d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f11960e.g(false);
            if (b(this.f11957b)) {
                try {
                    this.f11959d.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (b(this.f11957b)) {
                try {
                    this.f11959d.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
