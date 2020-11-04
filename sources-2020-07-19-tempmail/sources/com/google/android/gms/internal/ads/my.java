package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbw;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class my implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private zzdqu f4427a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4428b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4429c;

    /* renamed from: d  reason: collision with root package name */
    private final zzgo f4430d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4431e = 1;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedBlockingQueue<zzdrf> f4432f;
    private final HandlerThread g;
    private final zzdpm h;
    private final long i;

    public my(Context context, int i2, zzgo zzgo, String str, String str2, String str3, zzdpm zzdpm) {
        this.f4428b = str;
        this.f4430d = zzgo;
        this.f4429c = str2;
        this.h = zzdpm;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.i = System.currentTimeMillis();
        this.f4427a = new zzdqu(context, this.g.getLooper(), this, this, 19621000);
        this.f4432f = new LinkedBlockingQueue<>();
        this.f4427a.checkAvailabilityAndConnect();
    }

    private final void a() {
        zzdqu zzdqu = this.f4427a;
        if (zzdqu == null) {
            return;
        }
        if (zzdqu.isConnected() || this.f4427a.isConnecting()) {
            this.f4427a.disconnect();
        }
    }

    private final zzdqx b() {
        try {
            return this.f4427a.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @VisibleForTesting
    private static zzdrf c() {
        return new zzdrf((byte[]) null, 1);
    }

    private final void d(int i2, long j, Exception exc) {
        zzdpm zzdpm = this.h;
        if (zzdpm != null) {
            zzdpm.b(i2, System.currentTimeMillis() - j, exc);
        }
    }

    public final void E(Bundle bundle) {
        zzdqx b2 = b();
        if (b2 != null) {
            try {
                zzdrf q0 = b2.q0(new zzdrd(this.f4431e, this.f4430d, this.f4428b, this.f4429c));
                d(5011, this.i, (Exception) null);
                this.f4432f.put(q0);
            } catch (Throwable th) {
                d(2010, this.i, new Exception(th));
            } finally {
                a();
                this.g.quit();
            }
        }
    }

    public final void b0(ConnectionResult connectionResult) {
        try {
            d(4012, this.i, (Exception) null);
            this.f4432f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final zzdrf e(int i2) {
        zzdrf zzdrf;
        try {
            zzdrf = this.f4432f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            d(2009, this.i, e2);
            zzdrf = null;
        }
        d(3004, this.i, (Exception) null);
        if (zzdrf != null) {
            if (zzdrf.f8344d == 7) {
                zzdpm.f(zzbw.zza.zzc.DISABLED);
            } else {
                zzdpm.f(zzbw.zza.zzc.ENABLED);
            }
        }
        return zzdrf == null ? c() : zzdrf;
    }

    public final void y(int i2) {
        try {
            d(4011, this.i, (Exception) null);
            this.f4432f.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
