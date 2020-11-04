package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzsq {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f9276a = new bf0(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f9277b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public zzsz f9278c;
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    private Context f9279d;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: e  reason: collision with root package name */
    public zztd f9280e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9277b
            monitor-enter(r0)
            android.content.Context r1 = r3.f9279d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzsz r1 = r3.f9278c     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.df0 r1 = new com.google.android.gms.internal.ads.df0     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.cf0 r2 = new com.google.android.gms.internal.ads.cf0     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzsz r1 = r3.e(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f9278c = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsq.a():void");
    }

    /* access modifiers changed from: private */
    public final void b() {
        synchronized (this.f9277b) {
            if (this.f9278c != null) {
                if (this.f9278c.isConnected() || this.f9278c.isConnecting()) {
                    this.f9278c.disconnect();
                }
                this.f9278c = null;
                this.f9280e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    @VisibleForTesting
    private final synchronized zzsz e(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzsz(this.f9279d, zzq.zzlk().b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f9277b
            monitor-enter(r0)
            android.content.Context r1 = r2.f9279d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f9279d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaav.L1     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.c(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.a()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaav.K1     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.c(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.af0 r3 = new com.google.android.gms.internal.ads.af0     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzre r1 = com.google.android.gms.ads.internal.zzq.zzkz()     // Catch:{ all -> 0x0048 }
            r1.d(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsq.c(android.content.Context):void");
    }

    public final zzsx d(zzsy zzsy) {
        synchronized (this.f9277b) {
            if (this.f9280e == null) {
                zzsx zzsx = new zzsx();
                return zzsx;
            }
            try {
                zzsx C0 = this.f9280e.C0(zzsy);
                return C0;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call into cache service.", e2);
                return new zzsx();
            }
        }
    }

    public final void l() {
        if (((Boolean) zzwg.e().c(zzaav.M1)).booleanValue()) {
            synchronized (this.f9277b) {
                a();
                zzq.zzkw();
                zzaye.h.removeCallbacks(this.f9276a);
                zzq.zzkw();
                zzaye.h.postDelayed(this.f9276a, ((Long) zzwg.e().c(zzaav.N1)).longValue());
            }
        }
    }
}
