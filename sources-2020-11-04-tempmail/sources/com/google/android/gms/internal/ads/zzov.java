package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzov {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f9147a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public rd0<? extends zzow> f9148b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f9149c;

    public zzov(String str) {
        this.f9147a = zzpo.i(str);
    }

    public final boolean a() {
        return this.f9148b != null;
    }

    public final <T extends zzow> long b(T t, zzou<T> zzou, int i) {
        Looper myLooper = Looper.myLooper();
        zzpb.e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new rd0(this, myLooper, t, zzou, i, elapsedRealtime).d(0);
        return elapsedRealtime;
    }

    public final void f(Runnable runnable) {
        rd0<? extends zzow> rd0 = this.f9148b;
        if (rd0 != null) {
            rd0.e(true);
        }
        this.f9147a.execute(runnable);
        this.f9147a.shutdown();
    }

    public final void h(int i) throws IOException {
        IOException iOException = this.f9149c;
        if (iOException == null) {
            rd0<? extends zzow> rd0 = this.f9148b;
            if (rd0 != null) {
                rd0.c(rd0.f5001d);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void i() {
        this.f9148b.e(false);
    }
}
