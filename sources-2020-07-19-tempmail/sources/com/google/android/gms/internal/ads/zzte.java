package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzte {
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    public zzsz f9105a;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public boolean f9106b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9107c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f9108d = new Object();

    zzte(Context context) {
        this.f9107c = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.f9108d) {
            if (this.f9105a != null) {
                this.f9105a.disconnect();
                this.f9105a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future<InputStream> e(zzsy zzsy) {
        ff0 ff0 = new ff0(this);
        ef0 ef0 = new ef0(this, zzsy, ff0);
        if0 if0 = new if0(this, ff0);
        synchronized (this.f9108d) {
            zzsz zzsz = new zzsz(this.f9107c, zzq.zzlk().b(), ef0, if0);
            this.f9105a = zzsz;
            zzsz.checkAvailabilityAndConnect();
        }
        return ff0;
    }
}