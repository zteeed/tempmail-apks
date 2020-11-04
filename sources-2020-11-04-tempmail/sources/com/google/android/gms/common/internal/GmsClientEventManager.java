package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final GmsClientEventState f3187b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f3188c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f3189d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> f3190e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f3191f;
    private final AtomicInteger g;
    private boolean h;
    private final Handler i;
    private final Object j;

    @VisibleForTesting
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public final void a() {
        this.f3191f = false;
        this.g.incrementAndGet();
    }

    public final void b() {
        this.f3191f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Handler r0 = r7.i
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.e(r0, r1)
            android.os.Handler r0 = r7.i
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.j
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r2 = r7.f3190e     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r7.g     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            int r3 = r1.size()     // Catch:{ all -> 0x0049 }
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0047
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 1
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5     // Catch:{ all -> 0x0049 }
            boolean r6 = r7.f3191f     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r6 = r7.g     // Catch:{ all -> 0x0049 }
            int r6 = r6.get()     // Catch:{ all -> 0x0049 }
            if (r6 == r2) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r6 = r7.f3190e     // Catch:{ all -> 0x0049 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0022
            r5.h0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0022
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClientEventManager.c(com.google.android.gms.common.ConnectionResult):void");
    }

    @VisibleForTesting
    public final void d(Bundle bundle) {
        Preconditions.e(this.i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.j) {
            boolean z = true;
            Preconditions.n(!this.h);
            this.i.removeMessages(1);
            this.h = true;
            if (this.f3189d.size() != 0) {
                z = false;
            }
            Preconditions.n(z);
            ArrayList arrayList = new ArrayList(this.f3188c);
            int i2 = this.g.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f3191f || !this.f3187b.isConnected() || this.g.get() != i2) {
                    break;
                } else if (!this.f3189d.contains(connectionCallbacks)) {
                    connectionCallbacks.H(bundle);
                }
            }
            this.f3189d.clear();
            this.h = false;
        }
    }

    @VisibleForTesting
    public final void e(int i2) {
        Preconditions.e(this.i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.i.removeMessages(1);
        synchronized (this.j) {
            this.h = true;
            ArrayList arrayList = new ArrayList(this.f3188c);
            int i3 = this.g.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f3191f || this.g.get() != i3) {
                    break;
                } else if (this.f3188c.contains(connectionCallbacks)) {
                    connectionCallbacks.B(i2);
                }
            }
            this.f3189d.clear();
            this.h = false;
        }
    }

    public final void f(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.k(onConnectionFailedListener);
        synchronized (this.j) {
            if (!this.f3190e.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.j) {
                if (this.f3191f && this.f3187b.isConnected() && this.f3188c.contains(connectionCallbacks)) {
                    connectionCallbacks.H(this.f3187b.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
