package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class e0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final long f11737b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f11738c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f11739d;

    @VisibleForTesting
    e0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f11739d = firebaseInstanceId;
        this.f11737b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11738c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @VisibleForTesting
    private final boolean c() throws IOException {
        a0 s = this.f11739d.s();
        boolean z = true;
        if (!this.f11739d.r(s)) {
            return true;
        }
        try {
            String v = this.f11739d.v();
            if (v == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((s == null || (s != null && !v.equals(s.f11705a))) && "[DEFAULT]".equals(this.f11739d.i().i())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f11739d.i().i());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", v);
                Context a2 = a();
                Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a2.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } else if (e2.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f11739d.i().g();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (y.b().c(a())) {
            this.f11738c.acquire();
        }
        try {
            this.f11739d.q(true);
            if (!this.f11739d.y()) {
                this.f11739d.q(false);
                if (y.b().c(a())) {
                    this.f11738c.release();
                }
            } else if (!y.b().f(a()) || b()) {
                if (c()) {
                    this.f11739d.q(false);
                } else {
                    this.f11739d.m(this.f11737b);
                }
                if (y.b().c(a())) {
                    this.f11738c.release();
                }
            } else {
                new d0(this).a();
                if (y.b().c(a())) {
                    this.f11738c.release();
                }
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f11739d.q(false);
            if (y.b().c(a())) {
                this.f11738c.release();
            }
        } catch (Throwable th) {
            if (y.b().c(a())) {
                this.f11738c.release();
            }
            throw th;
        }
    }
}
