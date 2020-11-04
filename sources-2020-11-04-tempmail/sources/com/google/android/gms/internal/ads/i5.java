package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4200b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzaye f4201c;

    i5(zzaye zzaye, Context context) {
        this.f4201c = zzaye;
        this.f4200b = context;
    }

    public final void run() {
        synchronized (this.f4201c.f6236d) {
            String unused = this.f4201c.f6237e = zzaye.w(this.f4200b);
            this.f4201c.f6236d.notifyAll();
        }
    }
}
