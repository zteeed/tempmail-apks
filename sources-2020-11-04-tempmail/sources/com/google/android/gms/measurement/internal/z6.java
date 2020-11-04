package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class z6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzjo f10540b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10541c;

    /* renamed from: d  reason: collision with root package name */
    private final zzeu f10542d;

    /* renamed from: e  reason: collision with root package name */
    private final Intent f10543e;

    z6(zzjo zzjo, int i, zzeu zzeu, Intent intent) {
        this.f10540b = zzjo;
        this.f10541c = i;
        this.f10542d = zzeu;
        this.f10543e = intent;
    }

    public final void run() {
        this.f10540b.d(this.f10541c, this.f10542d, this.f10543e);
    }
}
