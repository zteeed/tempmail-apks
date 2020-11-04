package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class z6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzjo f10354b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10355c;

    /* renamed from: d  reason: collision with root package name */
    private final zzeu f10356d;

    /* renamed from: e  reason: collision with root package name */
    private final Intent f10357e;

    z6(zzjo zzjo, int i, zzeu zzeu, Intent intent) {
        this.f10354b = zzjo;
        this.f10355c = i;
        this.f10356d = zzeu;
        this.f10357e = intent;
    }

    public final void run() {
        this.f10354b.d(this.f10355c, this.f10356d, this.f10357e);
    }
}
