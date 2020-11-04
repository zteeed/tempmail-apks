package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fe implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<zzbus> f3792b;

    private fe(zzbus zzbus) {
        this.f3792b = new WeakReference<>(zzbus);
    }

    public final void run() {
        zzbus zzbus = (zzbus) this.f3792b.get();
        if (zzbus != null) {
            zzbus.E0();
        }
    }
}
