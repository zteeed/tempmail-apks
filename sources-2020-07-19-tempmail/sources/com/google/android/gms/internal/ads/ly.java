package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class ly implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private zzdqu f4330a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4331b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4332c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedBlockingQueue<zzcf.zza> f4333d = new LinkedBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private final HandlerThread f4334e;

    public ly(Context context, String str, String str2) {
        this.f4331b = str;
        this.f4332c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f4334e = handlerThread;
        handlerThread.start();
        this.f4330a = new zzdqu(context, this.f4334e.getLooper(), this, this, 9200000);
        this.f4330a.checkAvailabilityAndConnect();
    }

    private final void a() {
        zzdqu zzdqu = this.f4330a;
        if (zzdqu == null) {
            return;
        }
        if (zzdqu.isConnected() || this.f4330a.isConnecting()) {
            this.f4330a.disconnect();
        }
    }

    private final zzdqx b() {
        try {
            return this.f4330a.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @VisibleForTesting
    private static zzcf.zza c() {
        zzcf.zza.C0074zza w0 = zzcf.zza.w0();
        w0.k0(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (zzcf.zza) ((zzegb) w0.O());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        a();
        r3.f4334e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f4333d.put(c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        a();
        r3.f4334e.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzdqx r4 = r3.b()
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzdqt r0 = new com.google.android.gms.internal.ads.zzdqt     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f4331b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f4332c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzdqv r4 = r4.p6(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzcf$zza r4 = r4.u()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzcf$zza> r0 = r3.f4333d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
            r3.a()
            android.os.HandlerThread r4 = r3.f4334e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzcf$zza> r4 = r3.f4333d     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            com.google.android.gms.internal.ads.zzcf$zza r0 = c()     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            goto L_0x0039
        L_0x002f:
            r4 = move-exception
            r3.a()
            android.os.HandlerThread r0 = r3.f4334e
            r0.quit()
            throw r4
        L_0x0039:
            r3.a()
            android.os.HandlerThread r4 = r3.f4334e
            r4.quit()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly.E(android.os.Bundle):void");
    }

    public final void b0(ConnectionResult connectionResult) {
        try {
            this.f4333d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final zzcf.zza d(int i) {
        zzcf.zza zza;
        try {
            zza = this.f4333d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zza = null;
        }
        return zza == null ? c() : zza;
    }

    public final void y(int i) {
        try {
            this.f4333d.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
