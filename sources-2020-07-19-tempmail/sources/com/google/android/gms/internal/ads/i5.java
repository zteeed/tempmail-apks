package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4017b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzaye f4018c;

    i5(zzaye zzaye, Context context) {
        this.f4018c = zzaye;
        this.f4017b = context;
    }

    public final void run() {
        synchronized (this.f4018c.f6053d) {
            String unused = this.f4018c.f6054e = zzaye.w(this.f4017b);
            this.f4018c.f6053d.notifyAll();
        }
    }
}
