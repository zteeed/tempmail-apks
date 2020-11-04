package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class sf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbwx f5092b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5093c;

    sf(zzbwx zzbwx, Object obj) {
        this.f5092b = zzbwx;
        this.f5093c = obj;
    }

    public final void run() {
        try {
            this.f5092b.a(this.f5093c);
        } catch (Throwable th) {
            zzq.zzla().h(th, "EventEmitter.notify");
            zzaxv.l("Event emitter exception.", th);
        }
    }
}
