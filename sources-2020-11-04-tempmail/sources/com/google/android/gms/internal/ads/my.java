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
    private zzdqu f4610a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4611b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4612c;

    /* renamed from: d  reason: collision with root package name */
    private final zzgo f4613d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4614e = 1;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedBlockingQueue<zzdrf> f4615f;
    private final HandlerThread g;
    private final zzdpm h;
    private final long i;

    public my(Context context, int i2, zzgo zzgo, String str, String str2, String str3, zzdpm zzdpm) {
        this.f4611b = str;
        this.f4613d = zzgo;
        this.f4612c = str2;
        this.h = zzdpm;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.i = System.currentTimeMillis();
        this.f4610a = new zzdqu(context, this.g.getLooper(), this, this, 19621000);
        this.f4615f = new LinkedBlockingQueue<>();
        this.f4610a.checkAvailabilityAndConnect();
    }

    private final void a() {
        zzdqu zzdqu = this.f4610a;
        if (zzdqu == null) {
            return;
        }
        if (zzdqu.isConnected() || this.f4610a.isConnecting()) {
            this.f4610a.disconnect();
        }
    }

    private final zzdqx b() {
        try {
            return this.f4610a.e();
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

    public final void B(int i2) {
        try {
            d(4011, this.i, (Exception) null);
            this.f4615f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final void H(Bundle bundle) {
        zzdqx b2 = b();
        if (b2 != null) {
            try {
                zzdrf w0 = b2.w0(new zzdrd(this.f4614e, this.f4613d, this.f4611b, this.f4612c));
                d(5011, this.i, (Exception) null);
                this.f4615f.put(w0);
            } catch (Throwable th) {
                d(2010, this.i, new Exception(th));
            } finally {
                a();
                this.g.quit();
            }
        }
    }

    public final zzdrf e(int i2) {
        zzdrf zzdrf;
        try {
            zzdrf = this.f4615f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            d(2009, this.i, e2);
            zzdrf = null;
        }
        d(3004, this.i, (Exception) null);
        if (zzdrf != null) {
            if (zzdrf.f8527d == 7) {
                zzdpm.f(zzbw.zza.zzc.DISABLED);
            } else {
                zzdpm.f(zzbw.zza.zzc.ENABLED);
            }
        }
        return zzdrf == null ? c() : zzdrf;
    }

    public final void h0(ConnectionResult connectionResult) {
        try {
            d(4012, this.i, (Exception) null);
            this.f4615f.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
