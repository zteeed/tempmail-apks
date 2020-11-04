package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class sf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbwx f4909b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4910c;

    sf(zzbwx zzbwx, Object obj) {
        this.f4909b = zzbwx;
        this.f4910c = obj;
    }

    public final void run() {
        try {
            this.f4909b.a(this.f4910c);
        } catch (Throwable th) {
            zzq.zzla().h(th, "EventEmitter.notify");
            zzaxv.l("Event emitter exception.", th);
        }
    }
}
