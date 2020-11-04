package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzboi extends zzbnc {
    private final zzafn h;
    private final Runnable i;
    private final Executor j;

    public zzboi(zzbpa zzbpa, zzafn zzafn, Runnable runnable, Executor executor) {
        super(zzbpa);
        this.h = zzafn;
        this.i = runnable;
        this.j = executor;
    }

    public final void b() {
        this.j.execute(new mc(this, new nc(new AtomicReference(this.i))));
    }

    public final zzyi g() {
        return null;
    }

    public final void h(ViewGroup viewGroup, zzvh zzvh) {
    }

    public final zzdkj i() {
        return null;
    }

    public final View j() {
        return null;
    }

    public final zzdkj k() {
        return null;
    }

    public final int l() {
        return 0;
    }

    public final void m() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n(Runnable runnable) {
        try {
            if (!this.h.e6(ObjectWrapper.h0(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
