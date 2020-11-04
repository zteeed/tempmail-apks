package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdtu;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g10 extends zzdtu.k<Void> implements Runnable {
    private final Runnable i;

    public g10(Runnable runnable) {
        zzdsh.b(runnable);
        this.i = runnable;
    }

    public final void run() {
        try {
            this.i.run();
        } catch (Throwable th) {
            j(th);
            zzdsk.f(th);
            throw null;
        }
    }
}
